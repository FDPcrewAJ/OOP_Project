package com.dice_escape.board_squares;

public class ReverseSquare extends BoardSquare {
    public int dEffectChance;
    public int moveAmt;

    public ReverseSquare(String sColor, String sType, int sMoveChance, int sMoveAmt)
    {
        super(sColor, sType);
        dEffectChance = sMoveChance;
        moveAmt = sMoveAmt;
    }

    @Override
    public String toString() 
    {
        return "A " + type + " board square that is "
        + color + " has a d" + dEffectChance 
        + " chance of effect, will move the player " + moveAmt
        + " squares backwards, and has a width of "
        + width + " pixels.";
    }
    
}
