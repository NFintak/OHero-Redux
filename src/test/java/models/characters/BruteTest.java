package models.characters;

import ohero_redux.models.characters.Characters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.characters.Enemy;
import ohero_redux.models.characters.Brute;
import ohero_redux.models.utilities.CharStats;

public class BruteTest {

    @Test
    public void testNullConstructor() {
        Enemy troll = new Brute();
        assertNotNull(troll);
    }

    @Test
    public void testNonNullConstructor1() {
        Enemy troll = new Brute("Blinky");
        assertNotNull(troll);
    }

    @Test
    public void testNonNullConstructor2() {
        Enemy troll = new Brute("Blinky", new CharStats());
        assertNotNull(troll);
    }

    @Test
    public void testNonNullConstructor3() {
        Enemy troll = new Brute("Blinky", new CharStats(), "Large stone troll; it doesn't seem very smart...or well coordinated...");
        assertNotNull(troll);
    }

    @Test
    public void testNameGetterSetter() {
        Enemy troll = new Brute();
        String expected = "Blinky";
        assertEquals("", troll.getName());
        troll.setName(expected);
        assertEquals(expected, troll.getName());
    }

    @Test
    public void testStatsGetterSetter() {
        Enemy troll = new Brute("Blinky", new CharStats(0, 0, 0, 0, 0, 0));
        assertNotNull(troll.getStats());
        CharStats testStats = new CharStats(10, 10, 10, 10, 10, 10);
        troll.setStats(testStats);
        assertEquals(testStats, troll.getStats());
    }

    @Test
    public void testDescGetterSetter() {
        Brute troll = new Brute("Blinky", new CharStats());
        assertEquals("", troll.getDescription());
        String expected = "Large stone troll; it doesn't seem very smart...or well coordinated...";
        troll.setDescription(expected);
        assertEquals(expected, troll.getDescription());
    }

    @Test
    public void testHealthCheck() {
        Brute troll = new Brute();
        assertEquals("0/0", troll.getHealthStatus());
        troll.getStats().setTempHealth(20);
        assertEquals("20/20", troll.getHealthStatus());
    }

    @Test
    public void testInstanceOfEnemy() {
        Brute troll = new Brute();
        assertInstanceOf(Enemy.class, troll);
    }

    @Test
    public void testInstanceOfCharacter() {
        Brute troll = new Brute();
        assertInstanceOf(Characters.class, troll);
    }

}
