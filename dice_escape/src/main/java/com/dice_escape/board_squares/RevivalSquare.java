package com.dice_escape.board_squares;

public class RevivalSquare extends BoardSquare
    {
        String oddOrEven;

        public RevivalSquare(String sColor, String sType, String rollType)
        {
            super(sColor, sType);
            oddOrEven = rollType;
        }

        @Override
        public String toString() 
        {
            return "A " + type + " board square that is "
            + color + " with a required roll of " + oddOrEven
            + " and has a width of "
            + width + " pixels.";
        }
    
}
