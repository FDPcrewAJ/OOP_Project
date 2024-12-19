package com.dice_escape.roles;

/*
 * Soldier role defaults
 * damage buff: 4
 * movement debuff: 2
 * extra attack: true
 */

public class Soldier extends Player{
    public int damageBuff;
    public int movementDebuff;
    public boolean extraAttack;


    public Soldier(String pColor, String pRole, int pRveChance, int pDmgBuff, int pMvmtBuff, boolean pXtAttack)
    {
        super(pColor, pRole, pRveChance);;
        damageBuff = pDmgBuff;
        movementDebuff = pMvmtBuff;
        extraAttack = pXtAttack;
        
    }

    @Override
    public String toString()
    {
        return "Player with " + color + " color, " 
        + role + " role, " + health + " health, d" 
        + dMovement + " - " + movementDebuff + " movement, d" 
        + dAttack + " + " + damageBuff + " attack, extra attack: " 
        + extraAttack + " and d"
        + dReviveChance + " revive chance.";
    }
}
