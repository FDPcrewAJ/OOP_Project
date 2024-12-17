package com.dice_escape;


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

    public String makeRole(String role) 
    {
        if (role == "soldier") {
            Soldier soldier = new Soldier();
            String statReturn = soldier.toString();
            return statReturn;
        }

        if (role == "freerunner") {
            
        }

        if (role == "doctor") {
            
        }

        if (role == "spy") {
            
        }
    }


    @Override
    public String toString() 
    {
        return "Player with " + color + " color, " + role + " role, " + health + " health, " + dMovement + " movement, and " + dAttack + " attack";
    }
    
}
