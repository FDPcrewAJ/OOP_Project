package com.dice_escape.board_squares;

public class BoardSquare {
    public int width = 25;
    public String color;
    public String type;

    public BoardSquare(String sColor, String sType) 
    {
        color = sColor;
        type = sType;
    }
    
    @Override
    public String toString() 
    {
        return "A " + type + " board square that is "
        + color + " and has a width of "
        + width + " pixels.";
    }
    
}
