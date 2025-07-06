package models.characters;

import ohero_redux.models.characters.Characters;
import ohero_redux.models.characters.Enemy;
import ohero_redux.models.characters.Boss;
import ohero_redux.models.utilities.CharStats;
import ohero_redux.models.utilities.Inventory;
import ohero_redux.models.items.Items;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BossTest {

    Items loot = new Items();

    @Test
    public void testNullConstructor() {
        Boss test = new Boss();
        assertNotNull(test);
    }

    @Test
    public void testNonNullConstruct1() {
        Boss test = new Boss("Lich");
        assertNotNull(test);
    }

    @Test
    public void testNonNullConstruct2() {
        Boss test = new Boss("Lich", new CharStats());
        assertNotNull(test);
    }

    @Test
    public void testNonNullConstruct3() {
        Boss test = new Boss("Lich", new CharStats(), "A skeletal figure, commanding legions of undead");
        assertNotNull(test);
    }

    @Test
    public void testNonNullConstruct4() {
        Boss test = new Boss("Lich", new CharStats(), "", new Inventory());
        assertNotNull(test);
    }

    @Test
    public void testNonNullConstruct5() {
        Boss test = new Boss("Lich", new CharStats(), "", new Inventory(), new Items());
        assertNotNull(test);
    }

    @Test
    public void testNameGetterSetter() {
        Boss test = new Boss();
        assertEquals("", test.getName());
        String expected = "Lich";
        test.setName(expected);
        assertEquals(expected, test.getName());
    }

    @Test
    public void testStatsGetterSetter() {
        Boss test = new Boss("Lich");
        assertNotNull(test.getStats());
        CharStats expected = new CharStats();
        test.setStats(expected);
        assertEquals(expected, test.getStats());
    }

    @Test
    public void testDescGetterSetter() {
        Boss test = new Boss("Lich");
        assertEquals("", test.getDescription());
        String expected = "A skeletal figure, commanding legions of undead";
        test.setDescription(expected);
        assertEquals(expected, test.getDescription());
    }

}
