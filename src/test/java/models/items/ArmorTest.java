package models.items;

import ohero_redux.models.utilities.Item;
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
        Armor chestplate = new Armor("Chestplate", "Basic chestplate; No stat changes", 1);
        assertNotNull(chestplate);
    }

    @Test
    public void test4ArmorNonNullConstructor() {
        Armor chestplate = new Armor("Chestplate", "Basic chestplate; No stat changes", 1, new ItemStats());
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

    @Test
    public void testGetSetArmorDesc() {
        Armor armor = new Armor("Chestplate");
        assertEquals("", armor.getDescription());
        String expectedDesc = "Basic chestplate; No stat changes";
        armor.setDescription(expectedDesc);
        assertEquals(expectedDesc, armor.getDescription());
    }

    @Test
    public void testGetSetArmorStats() {
        Armor armor = new Armor("Reinforced Chestplate", "Slightly more sturdy chestplate; +2 health mod");
        assertNotNull(armor.getItemStats());
        ItemStats expectedStats = new ItemStats(0, 0, 0, 0, 2, 0);
        armor.setItemStats(expectedStats);
        assertEquals(expectedStats, armor.getItemStats());
    }

    @Test
    public void testGetItemSummary() {
        Armor boots = new Armor("Combat boots", "Worn leather boots; +2 dexterity mod, +2 health mod", 1, new ItemStats(2, 0, 0, 0, 2, 0));
        String expected = "Combat boots: Worn leather boots; +2 dexterity mod, +2 health mod, (1)\nDexterity: 2\nEnergy: 0\nStrength: 0\nIntellect: 0\nHealth: 2\nCharisma: 0";
    }

    @Test
    public void testInstanceOfItem() {
        Armor armor = new Armor();
        assertInstanceOf(Item.class, armor);
    }

}
