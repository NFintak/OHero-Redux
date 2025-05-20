package models.utilities;

import org.junit.jupiter.api.Test;
import ohero_redux.models.utilities.CharStats;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CharStatsTest {

    CharStats testStats = new CharStats(10, 10, 10,
            10, 10, 10);
    CharStats testStats2 = new CharStats();

    @Test
    public void testCharStatsConstructor() {
        CharStats stats = new CharStats(10, 10, 10,
                10, 10, 10);
        assertNotNull(stats);
    }

    @Test
    public void testCharStatsNullConstructor() {
        CharStats stats = new CharStats();
        assertNotNull(stats);
        assertEquals(0, stats.getDexterity());
    }

    @Test
    public void testCharStatGetters() {
        assertEquals(10, testStats.getDexterity());
        assertEquals(10, testStats.getEnergy());
        assertEquals(10, testStats.getStrength());
        assertEquals(10, testStats.getIntellect());
        assertEquals(10, testStats.getHealth());
        assertEquals(10, testStats.getCharisma());
    }

    @Test
    public void testDexteritySetter() {
        testStats2.setDexterity(10);
        Integer expected = 10;
        assertEquals(expected, testStats2.getDexterity());
    }

    @Test
    public void testEnergySetter() {
        testStats2.setEnergy(10);
        Integer expected = 10;
        assertEquals(expected, testStats2.getEnergy());
    }

    @Test
    public void testStrengthSetter() {
        testStats2.setStrength(10);
        Integer expected = 10;
        assertEquals(expected, testStats2.getStrength());
    }

    @Test
    public void testIntellectSetter() {
        testStats2.setIntellect(10);
        Integer expected = 10;
        assertEquals(expected, testStats.getIntellect());
    }

    @Test
    public void testHealthSetter() {
        testStats2.setHealth(15);
        Integer expected = 15;
        assertEquals(expected, testStats2.getHealth());
    }

    @Test
    public void testCharismaSetter() {
        testStats2.setCharisma(10);
        Integer expected = 10;
        assertEquals(expected, testStats2.getCharisma());
    }

}
