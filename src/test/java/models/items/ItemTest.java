package models.items;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.items.Item;
import ohero_redux.models.utilities.ItemStats;

public class ItemTest {

    @Test
    public void testNullItemConstructor() {
        Item item = new Item();
        assertNotNull(item);
    }

    @Test
    public void test1NonNullItemConstructor() {
        Item item = new Item("Rations", "Daily food rations");
        assertNotNull(item);
    }

    @Test
    public void test2NonNullItemConstructor() {
        Item item = new Item("Rations", "Daily food rations", 14);
        assertNotNull(item);
    }

    @Test
    public void test3NonNullItemConstructor() {
        Item item = new Item("Strength Potion", "Potion; Increases strength", 2, new ItemStats(0, 0, 2, 0, 0, 0));
        assertNotNull(item);
    }

    @Test
    public void testGetSetItemName() {
        Item item = new Item();
        assertEquals("", item.getName());
        String expectedName = "Health Potion";
        item.setName(expectedName);
        assertEquals(expectedName, item.getName());
    }

    @Test
    public void testGetSetDescription() {
        Item item = new Item("Health Potion");
        assertEquals("", item.getDescription());
        String expectedDesc = "Potion; Temporarily increases total health, health increase is lost when temp. health drops below bonus health points";
        item.setDescription(expectedDesc);
        assertEquals(expectedDesc, item.getDescription());
    }

    @Test
    public void testGetSetQuantity() {
        Item item = new Item();
        assertEquals(1, item.getQuantity());
        item.setQuantity(5);
        assertEquals(5, item.getQuantity());
    }

    @Test
    public void testGetSetItemStats() {
        Item item = new Item();
        assertNotNull(item.getItemStats());
        ItemStats stats = new ItemStats(0, 0, 0, 2, 0, 2);
        item.setItemStats(stats);
        assertEquals(stats, item.getItemStats());
    }

    //add test for item summary?

}
