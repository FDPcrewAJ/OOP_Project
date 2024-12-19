package com.dice_escape.roles;

/*
 * Spy Defaults
 * sabatoge range: 4
 * sabatoge chance: d6
 * health debuff: 5
 */

public class Spy extends Player {
    int sabatogeRange;
    int sabatogeChance;
    int healthDebuff;

    public Spy(String pColor, String pRole, int pRveChance, int pSbtgRange, int pSbtgChance, int pHlthDebuff)
    {
        super(pColor, pRole, pRveChance);
        sabatogeRange = pSbtgRange;
        sabatogeChance = pSbtgChance;
        healthDebuff = pHlthDebuff;
    }

    @Override
    public String toString()
    {
        return "Player with " + color + " color, " 
        + role + " role, " 
        + health + " - " + healthDebuff + " health, d" 
        + dMovement + " movement, d" 
        + dAttack + " attack, " 
        + sabatogeRange + " sabatoge range, d" 
        + sabatogeChance + " sabatoge chance, and d"
        + dReviveChance + " revive chance";
    }
    
}
