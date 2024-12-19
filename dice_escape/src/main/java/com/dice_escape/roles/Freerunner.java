package com.dice_escape.roles;

/*
 * Freerunner defaults:
 * movement buff: 6
 * attack debuff: 4
 * health debuff: 5
 * dodge chance (dside #): 4
 */

public class Freerunner extends Player {
    int movementBuff;
    int attackDebuff;
    int healthDebuff;
    int dDodgeChance;

    public Freerunner(String pColor, String pRole, int pRveChance, int pMvmtBuff, int patkDebuff, int phlthDebuff, int pDgeChance)
    {
        super(pColor, pRole, pRveChance);
        movementBuff = pMvmtBuff;
        attackDebuff = patkDebuff;
        healthDebuff = phlthDebuff;
        dDodgeChance = pDgeChance;
    }
    
    @Override
    public String toString()
    {
        return "Player with " + color + " color, " 
        + role + " role, " 
        + health + " - " + healthDebuff + " health, d" 
        + dMovement + " + " + movementBuff + " movement, d" 
        + dAttack + " - " + attackDebuff + " attack, d" 
        + dDodgeChance + " dodge chance, and d" 
        + dReviveChance + " revive chance.";
    }
}
