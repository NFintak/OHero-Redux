package models.items;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.items.Armor;
import ohero_redux.models.utilities.ItemStats;

public class ArmorTest {

    @Test
    public void testArmorNullConstructor() {
        Armor armor = new Armor();
        assertNotNull(armor);
    }

    @Test
    public void test1ArmorNonNullConstructor() {
        Armor chestplate = new Armor("Chestplate");
        assertNotNull(chestplate);
    }

    @Test
    public void test2ArmorNonNullConstructor() {
        Armor chestplate = new Armor("Chestplate", "Basic chestplate; Offers no stat changes");
        assertNotNull(chestplate);
    }

    @Test
    public void test3ArmorNonNullConstructor() {
        Armor chestplate = new Armor("Chestplate", "Basic chestplate; No stat changes", new ItemStats());
        assertNotNull(chestplate);
    }

    @Test
    public void testGetSetArmorName() {
        Armor armor = new Armor();
        assertEquals("", armor.getName());
        String expectedName = "Chestplate";
        armor.setName(expectedName);
        assertEquals(expectedName, armor.getName());
    }

}
