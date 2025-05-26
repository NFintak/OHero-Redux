package models.utilities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.utilities.ItemStats;

public class ItemStatsTest {

    ItemStats testStats = new ItemStats();
    ItemStats testStats2 = new ItemStats(1, 2, 3, 4, 5, 6);

    @Test
    public void testItemStatConstructs() {
        assertNotNull(testStats);
        assertNotNull(testStats2);
    }

    @Test
    public void testDexMod() {
        assertEquals(1, testStats2.getDexMod());
        testStats2.setDexMod(2);
        assertEquals(2, testStats2.getDexMod());
    }

    @Test
    public void testEnergyMod() {
        assertEquals(2, testStats2.getEnergyMod());
        testStats2.setEnergyMod(3);
        assertEquals(3, testStats2.getEnergyMod());
    }

    @Test
    public void testStrengthMod() {
        assertEquals(3, testStats2.getStrengthMod());
        testStats2.setStrengthMod(4);
        assertEquals(4, testStats2.getStrengthMod());
    }

    @Test
    public void testIntellectMod() {
        assertEquals(4, testStats2.getIntellectMod());
        testStats2.setIntellectMod(5);
        assertEquals(5, testStats2.getIntellectMod());
    }

    @Test
    public void testHealthMod() {
        assertEquals(5, testStats2.getTotalHealthMod());
        testStats2.setTotalHealthMod(6);
        assertEquals(6, testStats2.getTotalHealthMod());
    }

    @Test
    public void testCharismaMod() {
        assertEquals(6, testStats2.getCharismaMod());
        testStats2.setCharismaMod(7);
        assertEquals(7, testStats2.getCharismaMod());
    }

}
