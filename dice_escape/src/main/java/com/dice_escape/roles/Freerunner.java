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

    public Freerunner(String pColor, String pRole, int pMvmtBuff, int patkDebuff, int phlthDebuff, int pDgeChance)
    {
        super(pColor, pRole);
        movementBuff = pMvmtBuff;
        attackDebuff = patkDebuff;
        healthDebuff = phlthDebuff;
        dDodgeChance = pDgeChance;
    }
    
    public String toString()
    {
        return "Player with " + color + " color, " + role + " role, " + health + " - " + healthDebuff + " health, " 
        + dMovement + " + " + movementBuff + " movement, " + dAttack + " - " + attackDebuff + " attack, and " 
        + dDodgeChance + " dodge chance.";
    }
}
