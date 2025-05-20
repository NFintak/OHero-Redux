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
    public void testDexIncrDecr() {
        assertEquals(10, testStats.getDexterity());
        testStats.incrDex(3);
        assertEquals(13, testStats.getDexterity());
        testStats.decrDex(2);
        assertEquals(11, testStats.getDexterity());
    }

    @Test
    public void testEnergySetter() {
        testStats2.setEnergy(10);
        Integer expected = 10;
        assertEquals(expected, testStats2.getEnergy());
    }

    @Test
    public void testEnergyIncrDecr() {
        assertEquals(10, testStats.getEnergy());
        testStats.incrEnergy(5);
        assertEquals(15, testStats.getEnergy());
        testStats.decrEnergy(3);
        assertEquals(12, testStats.getEnergy());
    }

    @Test
    public void testStrengthSetter() {
        testStats2.setStrength(10);
        Integer expected = 10;
        assertEquals(expected, testStats2.getStrength());
    }

    @Test
    public void testStrengthIncrDecr() {
        assertEquals(10, testStats.getStrength());
        testStats.incrStrength(5);
        assertEquals(15, testStats.getStrength());
        testStats.decrStrength(1);
        assertEquals(14, testStats.getStrength());
    }

    @Test
    public void testIntellectSetter() {
        testStats2.setIntellect(10);
        Integer expected = 10;
        assertEquals(expected, testStats.getIntellect());
    }

    @Test
    public void testIntellectIncrDecr() {
        assertEquals(10, testStats.getIntellect());
        testStats.incrIntellect(4);
        assertEquals(14, testStats.getIntellect());
        testStats.decrIntellect(2);
        assertEquals(12, testStats.getIntellect());
    }

    @Test
    public void testHealthSetter() {
        testStats2.setHealth(15);
        Integer expected = 15;
        assertEquals(expected, testStats2.getHealth());
    }

    @Test
    public void testHealthIncrDecr() {
        assertEquals(10, testStats.getHealth());
        testStats.incrHealth(5);
        assertEquals(15, testStats.getHealth());
        testStats.decrHealth(3);
        assertEquals(12, testStats.getHealth());
    }

    @Test
    public void testCharismaSetter() {
        testStats2.setCharisma(10);
        Integer expected = 10;
        assertEquals(expected, testStats2.getCharisma());
    }

    @Test
    public void testCharismaIncrDecr() {
        assertEquals(10, testStats.getCharisma());
        testStats.incrCharisma(5);
        assertEquals(15, testStats.getCharisma());
        testStats.decrCharisma(2);
        assertEquals(13, testStats.getCharisma());
    }

    @Test
    public void testNegativeStatCatch() {
        assertEquals(10, testStats.getDexterity());
        testStats.decrDex(11);
        assertEquals(0, testStats.getDexterity());
    }

}
