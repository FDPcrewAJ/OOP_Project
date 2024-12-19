package com.dice_escape.roles;

/*
 * Doctor Defaults
 * health buff: 20
 * healing buff: d8
 * attack debuff: -5
 * revival buff: 2
 */

public class Doctor extends Player {
    int healthBuff = 20;
    int dHealingBuff = 8;
    int attackDebuff = 5;
    int revivalBuff = 2;

    public Doctor(String pColor, String pRole, int pRveChance, int pHlthBuff, int pHlnBuff, int pAtkDebuff, int pRvlBuff)
    {
        super(pColor, pRole, pRveChance);
        healthBuff = pHlthBuff;
        dHealingBuff = pHlnBuff;
        attackDebuff = pAtkDebuff;
        revivalBuff = pRvlBuff;
    }
    
    @Override
    public String toString()
    {
        return "Player with " + color + " color, " 
        + role + " role, " 
        + health + " + " + healthBuff + " health, d"
        + dHealingBuff + " healing buff, d"
        + dMovement + " movement, d" 
        + dAttack + " - " + attackDebuff + " attack" + " and d" 
        + dReviveChance + " + " + revivalBuff + " revive chance.";
    }
}
