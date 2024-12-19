package com.dice_escape;

public class Die {
    public int numSides;

    public Die(int sideNumber)
    {
        numSides = sideNumber;
    }

    @Override
    public String toString()
    {
        return "A d" + numSides + " die.";
    }
}
