package ohero_redux.models.utilities;

import java.util.Random;

public class Dice {

    private Integer dieType;
    private Integer numOfDice;
    private Integer rollTotal;
    private final Random roll = new Random();

    public Dice() {
        this.dieType = 20;
        this.numOfDice = 1;
        this.rollTotal = diceRoll(this.dieType, this.numOfDice);
    }

    public Dice(Integer dieType) {
        this.dieType = dieType;
        this.numOfDice = 1;
        this.rollTotal = diceRoll(this.dieType, this.numOfDice);
    }

    public Dice(Integer numOfDice, Integer dieType) {
        this.dieType = dieType;
        this.numOfDice = numOfDice;
        this.rollTotal = diceRoll(this.dieType, this.numOfDice);
    }

    public Integer diceRoll(Integer dieType, Integer numOfDice) {
        Integer total = 0;
        for (int i = 0; i < numOfDice; i++) {
            total += roll.nextInt(1, dieType + 1);
        }
        return total;
    }

    public Integer getRoll() {
        return rollTotal;
    }

    public void setRoll() {
        this.rollTotal = diceRoll(this.dieType, this.numOfDice);
    }

}
