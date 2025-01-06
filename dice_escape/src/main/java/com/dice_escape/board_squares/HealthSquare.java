package com.dice_escape.board_squares;

public class HealthSquare extends BoardSquare {
    public int dhealingChance;
    public int healingAmt;

    public HealthSquare(String sColor, String sType, int sHealChance, int sHealAmt)
    {
        super(sColor, sType);
        dhealingChance = sHealChance;
        healingAmt = sHealAmt;
    }

    @Override
    public String toString()
    {
        return "A " + type + " board square that is "
        + color + " has a d" + dhealingChance
        + " will heal the player by " + healingAmt
        + " and has a width of "
        + width + " pixels.";
    }
    
}
