package models.utilities;

import ohero_redux.models.utilities.Dice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testDiceNullConstructor() {
        Dice test = new Dice();
        assertNotNull(test);
        int numBetween0And21 = 0;
        for (int i = 0; i < 100; i++) {
            test.setRoll();
            Integer roll = test.getRoll();
            if (roll > 0 && roll < 21) {
                numBetween0And21++;
            }
        }
        assertEquals(100, numBetween0And21);
    }

    @Test
    public void test1DiceNonNull() {
        Dice test = new Dice(6);
        assertNotNull(test);
        int numBetween0And7 = 0;
        for (int i = 0; i < 100; i++) {
            test.setRoll();
            Integer roll = test.getRoll();
            if (roll > 0 && roll < 7) {
                numBetween0And7++;
            }
        }
        assertEquals(100, numBetween0And7);
    }

    @Test
    public void test2DiceNonNull() {
        Dice test = new Dice(2, 6);
        assertNotNull(test);
        int numBetween1And13 = 0;
        for (int i = 0; i < 100; i++) {
            test.setRoll();
            Integer roll = test.getRoll();
            if (roll > 1 && roll < 13) {
                numBetween1And13++;
            }
        }
        assertEquals(100, numBetween1And13);
    }

}

