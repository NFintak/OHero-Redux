package models.items;

import ohero_redux.models.utilities.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.items.Weapon;
import ohero_redux.models.utilities.ItemStats;

public class WeaponTest {

    Weapon dagger = new Weapon();

    @Test
    public void testNullConstructor() {
        Weapon test = new Weapon();
        assertNotNull(test);
    }

    @Test
    public void test1NonNullConstructor() {
        Weapon test = new Weapon("");
        assertNotNull(test);
    }

    @Test
    public void test2NonNullConstructor() {
        Weapon test = new Weapon("", "");
        assertNotNull(test);
    }

    @Test
    public void test3NonNullConstructor() {
        Weapon test = new Weapon("", "", 0);
        assertNotNull(test);
    }

    @Test
    public void test4NonNullConstructor() {
        Weapon test = new Weapon("", "", 0, new ItemStats());
        assertNotNull(test);
    }

    @Test
    public void testGetSetName() {
        assertEquals("", dagger.getName());
        String expected = "Dagger";
        dagger.setName(expected);
        assertEquals(expected, dagger.getName());
    }

    @Test
    public void tesGetSetDesc() {
        assertEquals("", dagger.getDescription());
        String expected = "Basic dagger; offers no stat changes";
        dagger.setDescription(expected);
        assertEquals(expected, dagger.getDescription());
    }

    @Test
    public void testGetSetQuantity() {
        assertEquals(1, dagger.getQuantity());
        dagger.setQuantity(3);
        assertEquals(3, dagger.getQuantity());
    }

    @Test
    public void testGetSetItemStats() {
        assertNotNull(dagger.getItemStats());
        ItemStats expected = new ItemStats();
        dagger.setItemStats(expected);
        assertEquals(expected, dagger.getItemStats());
    }

    @Test
    public void testGetItemSummary() {
        Weapon arrows = new Weapon("Quiver of arrows", "Holds up to 30 arrows at a time; no stat changes", 25, new ItemStats());
        String expected = "Quiver of arrows: Holds up to 30 arrows at a time; no stat changes, (25)\nDexterity: 0\nEnergy: 0\nStrength: 0\nIntellect: 0\nHealth: 0\nCharisma: 0";
        assertEquals(expected, arrows.itemSummary());
    }

    @Test
    public void testInstanceOfItem() {
        Weapon dagger = new Weapon();
        assertInstanceOf(Item.class, dagger);
    }

}
