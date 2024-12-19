package com.dice_escape.roles;


public class Player {
    public static String color;
    public String role;
    public int health = 30;
    public int dMovement = 4;
    public int dAttack = 6;

    public Player(String pColor, String pRole)
    {
        color = pColor;
        role = pRole;
    }

    @Override
    public String toString() 
    {
        return "Player with " + color + " color, " + role + " role, " + health + " health, " + dMovement + " movement, and " + dAttack + " attack";
    }
    
}
