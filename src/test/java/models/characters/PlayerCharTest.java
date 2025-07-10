package models.characters;

import ohero_redux.models.characters.PlayerChar;
import ohero_redux.models.utilities.CharStats;
import ohero_redux.models.utilities.Inventory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.items.Items;

public class PlayerCharTest {

    PlayerChar testPlayer = new PlayerChar("test");
    Items item1 = new Items();
    Items item2 = new Items();

    @Test
    public void testNullPlayerConstructor() {
        PlayerChar player1 = new PlayerChar();
        assertNotNull(player1);
    }

    @Test
    public void testPlayerConstructor1() {
        PlayerChar player1 = new PlayerChar("player1");
        assertNotNull(player1);
    }

    @Test
    public void testPlayerConstructor2() {
        PlayerChar player1 = new PlayerChar("test", 123L);
        assertNotNull(player1);
    }

    @Test
    public void testGetSetId() {
        assertEquals(0L, testPlayer.getId());
        testPlayer.setId(123L);
        assertEquals(123L, testPlayer.getId());
    }

    @Test
    public void testGetName() {
        String expected = "test";
        String actual = testPlayer.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        String newName = "testName";
        assertEquals("test", testPlayer.getName());
        testPlayer.setName(newName);
        assertEquals(newName, testPlayer.getName());
    }

    @Test
    public void testGetStats() {
        CharStats testStats = new CharStats();
        assertEquals(testStats.getDexterity(), testPlayer.getStats().getDexterity());
        assertEquals(testStats.getEnergy(), testPlayer.getStats().getEnergy());
        assertEquals(testStats.getStrength(), testPlayer.getStats().getStrength());
        assertEquals(testStats.getIntellect(), testPlayer.getStats().getIntellect());
        assertEquals(testStats.getTempHealth(), testPlayer.getStats().getTempHealth());
        assertEquals(testStats.getCharisma(), testPlayer.getStats().getCharisma());
    }

    @Test
    public void testSetStats() {
        CharStats testStats = new CharStats(12, 10, 12, 12, 10, 10);
        testPlayer.setStats(testStats);
        assertEquals(12, testPlayer.getStats().getDexterity());
        assertEquals(10, testPlayer.getStats().getEnergy());
        assertEquals(12, testPlayer.getStats().getStrength());
        assertEquals(12, testPlayer.getStats().getIntellect());
        assertEquals(10, testPlayer.getStats().getTempHealth());
        assertEquals(10, testPlayer.getStats().getTotalHealth());
        assertEquals(10, testPlayer.getStats().getCharisma());
    }

    @Test
    public void testCharSummary() {
        String expected = "test\nDexterity: 0\nEnergy: 0\nStrength: 0\nIntellect: 0\nHealth: 0/0\nCharisma: 0";
        String actual = testPlayer.characterSummary();
        assertEquals(expected, actual);
    }

    @Test
    public void testCharInventory() {
        assertNotNull(testPlayer.getPlayerInventory());
    }

    @Test
    public void testAddToPlayerInventory() {
        testPlayer.getPlayerInventory().addItem(item1);
        testPlayer.getPlayerInventory().addItem(item2);
        Inventory testInventory = testPlayer.getPlayerInventory();
        assertEquals(testInventory, testPlayer.getPlayerInventory());
    }

    @Test
    public void testHealthStatus() {
        PlayerChar test = new PlayerChar();
        assertEquals("0/0", test.getHealthStatus());
        test.getStats().setTempHealth(20);
        assertEquals("20/20", test.getHealthStatus());
    }

}
