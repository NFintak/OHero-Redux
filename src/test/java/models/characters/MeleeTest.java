package models.characters;

import ohero_redux.models.characters.Characters;
import ohero_redux.models.characters.Enemy;
import ohero_redux.models.characters.Melee;
import ohero_redux.models.utilities.CharStats;
import ohero_redux.models.utilities.Inventory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeleeTest {

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

}
