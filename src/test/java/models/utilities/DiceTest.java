package models.utilities;

import ohero_redux.models.utilities.Dice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testDiceNullConstructor() {
        Dice test = new Dice();
        assertNotNull(test);
        int numBetween1And20 = 0;
        for (int i = 0; i < 100; i++) {
            Integer roll = test.getRoll();
            if (roll > 0 && roll < 21) {
                numBetween1And20++;
            }
        }
        assertEquals(100, numBetween1And20);
        //null constructor will assume that the roll is for a d20 die, should produce a number between 1 and 20
    }

    @Test
    public void test1DiceNonNull() {
//        Dice test = new Dice(6);
//        assertNotNull(test);
//        test.setRoll();
//        assertTrue(test.getRoll() > 0 && test.getRoll() < 7);
        //one integer in constructor assumes one die of that value being rolled
    }

    @Test
    public void test2DiceNonNull() {
        //Dice test = new Dice(2, 6);
        //assertNotNull(test);
        //test.setRoll();
        //assertTrue(test.getRoll() > 1 && test.getRoll() < 13);
        //two integers in constructor takes first num as num of dice and second num as highest num for one die
    }

}

