package com.dice_escape.roles;


public class Player {
    public static String color;
    public String role;
    public int health = 30;
    public int dMovement = 4;
    public int dAttack = 6;
    public int dReviveChance = 4;

    public Player(String pColor, String pRole, int pRveChance)
    {
        color = pColor;
        role = pRole;
        dReviveChance = pRveChance;
    }

    @Override
    public String toString() 
    {
        return "Player with " + color + " color, " 
        + role + " role, " 
        + health + " health, d" 
        + dMovement + " movement, d" 
        + dAttack + " attack" + " and d" 
        + dReviveChance + " revive chance";
    }
    
}
