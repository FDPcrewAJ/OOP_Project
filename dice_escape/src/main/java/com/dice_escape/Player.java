package com.dice_escape;

public class Player {
    private String color;
    public String role;
    public int health;
    public int movement;
    public int attack;

    public Player(String pColor, String pRole, int pHealth, int pMovement, int pAttack)
    {
        color = pColor;
        role = pRole;
        health = pHealth;
        movement = pMovement;
        attack = pAttack;
    }


    public String toString() 
    {
        return String.join("Player with " + color + " color, " + role + " role, " + health + " health, " + movement + " movement, and" + attack + " attack");
    }
    
}
