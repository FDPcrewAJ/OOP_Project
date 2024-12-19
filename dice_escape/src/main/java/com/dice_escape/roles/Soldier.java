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


    public Soldier(String pColor, String pRole, int pDmgBuff, int pMvmtBuff, boolean pXtAttack)
    {
        super(pColor, pRole);
        damageBuff = pDmgBuff;
        movementDebuff = pMvmtBuff;
        extraAttack = pXtAttack;
        
    }

    @Override
    public String toString()
    {
        return "Player with " + color + " color, " + role + " role, " + health + " health, " 
        + dMovement + " - " + movementDebuff + " movement, " 
        + dAttack + " + " + damageBuff + " attack and extra attack: " + extraAttack;
    }
}
