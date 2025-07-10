package models.characters;

import ohero_redux.models.characters.Characters;
import ohero_redux.models.characters.Enemy;
import ohero_redux.models.characters.Melee;
import ohero_redux.models.utilities.CharStats;
import ohero_redux.models.utilities.Inventory;
import ohero_redux.models.items.Items;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeleeTest {

    Items testItem = new Items();

    @Test
    public void testNullConstructor() {
        Enemy test = new Melee();
        assertNotNull(test);
    }

    @Test
    public void testNonNullConstructor1() {
        Enemy test = new Melee("Wraith");
        assertNotNull(test);
    }

    @Test
    public void testNonNullConstructor2() {
        Enemy test = new Melee("Wraith", new CharStats(1, 2, 3, 4, 5, 6));
        assertNotNull(test);
    }

    @Test
    public void testNotNullConstructor3() {
        Enemy test = new Melee("Wraith", new CharStats(1, 2, 3, 4, 5, 6), "A whispy, translucent figure; it almost looks familiar");
        assertNotNull(test);
    }

    @Test
    public void testNotNullConstructor4() {
        Enemy test = new Melee("Wraith", new CharStats(1, 2, 3, 4, 5, 6), "A whispy, translucent figure; it almost looks familiar", new Inventory());
        assertNotNull(test);
    }

    @Test
    public void testNameGetterSetter() {
        Enemy test = new Melee();
        assertEquals("", test.getName());
        String expected = "Wraith";
        test.setName(expected);
        assertEquals(expected, test.getName());
    }

    @Test
    public void testStatsGetterSetter() {
        Enemy test = new Melee("Wraith", new CharStats(0, 0, 0, 0, 0, 0));
        assertNotNull(test.getStats());
        CharStats expected = new CharStats(10, 10, 10, 10, 10, 10);
        test.setStats(expected);
        assertEquals(expected, test.getStats());
    }

    @Test
    public void testDescGetterSetter() {
        Melee test = new Melee("Wraith", new CharStats());
        assertEquals("", test.getDescription());
        String expected = "A whispy, translucent figure; it almost looks familiar";
        test.setDescription(expected);
        assertEquals(expected, test.getDescription());
    }

    @Test
    public void testInvenGetterSetter() {
        Melee test = new Melee();
        assertNotNull(test.getInventory());
        Inventory expected = new Inventory();
        expected.addItem(testItem);
        test.setInventory(expected);
        assertEquals(expected, test.getInventory());
    }

    @Test
    public void testHealthCheck() {
        Melee test = new Melee();
        assertEquals("0/0", test.getHealthStatus());
        test.getStats().setTempHealth(20);
        assertEquals("20/20", test.getHealthStatus());
    }

    @Test
    public void testInstanceOfEnemy() {
        Melee test = new Melee();
        assertInstanceOf(Enemy.class, test);
    }

    @Test
    public void testInstanceOfCharacter() {
        Melee test = new Melee();
        assertInstanceOf(Characters.class, test);
    }

}
