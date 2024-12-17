package com.dice_escape;

public class Soldier extends Player{
    public int damageBuff = 4;
    public int movementDebuff = 2;
    public boolean extraAttack = true;


    public Soldier()
    {
        super("red", "soldier");
        
    }

    @Override
    public String toString()
    {
        return "soldier " + "test";
    }
}
