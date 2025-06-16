package models.items;

import ohero_redux.models.utilities.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.items.Items;
import ohero_redux.models.utilities.ItemStats;

public class ItemsTest {

    @Test
    public void testNullItemConstructor() {
        Items items = new Items();
        assertNotNull(items);
    }

    @Test
    public void test1NonNullItemConstructor() {
        Items items = new Items("Rations", "Daily food rations");
        assertNotNull(items);
    }

    @Test
    public void test2NonNullItemConstructor() {
        Items items = new Items("Rations", "Daily food rations", 14);
        assertNotNull(items);
    }

    @Test
    public void test3NonNullItemConstructor() {
        Items items = new Items("Strength Potion", "Potion; Increases strength", 2, new ItemStats(0, 0, 2, 0, 0, 0));
        assertNotNull(items);
    }

    @Test
    public void testGetSetItemName() {
        Items items = new Items();
        assertEquals("", items.getName());
        String expectedName = "Health Potion";
        items.setName(expectedName);
        assertEquals(expectedName, items.getName());
    }

    @Test
    public void testGetSetDescription() {
        Items items = new Items("Health Potion");
        assertEquals("", items.getDescription());
        String expectedDesc = "Potion; Temporarily increases total health, health increase is lost when temp. health drops below bonus health points";
        items.setDescription(expectedDesc);
        assertEquals(expectedDesc, items.getDescription());
    }

    @Test
    public void testGetSetQuantity() {
        Items items = new Items();
        assertEquals(1, items.getQuantity());
        items.setQuantity(5);
        assertEquals(5, items.getQuantity());
    }

    @Test
    public void testGetSetItemStats() {
        Items items = new Items();
        assertNotNull(items.getItemStats());
        ItemStats stats = new ItemStats(0, 0, 0, 2, 0, 2);
        items.setItemStats(stats);
        assertEquals(stats, items.getItemStats());
    }

    //add test for item summary?

    @Test
    public void testInstanceOfItem() {
        Items item = new Items();
        assertInstanceOf(Item.class, item);
    }

}
