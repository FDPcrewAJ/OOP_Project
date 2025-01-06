package com.dice_escape.board_squares;

public class CombatSquare extends BoardSquare {
    public int enemyHealth;
    public int dEnemyAttack;

    public CombatSquare(String sColor, String sType, int sEnemyHealth, int sEnemyAttack)
    {
        super(sColor, sType);
        enemyHealth = sEnemyHealth;
        dEnemyAttack = sEnemyAttack;
    }

    @Override
    public String toString() 
    {
        return "A " + type + " board square that is "
        + color + " with an enemy health of " + enemyHealth
        + " with an attack roll of d" + dEnemyAttack
        + " and has a width of "
        + width + " pixels.";
    }
    
}
