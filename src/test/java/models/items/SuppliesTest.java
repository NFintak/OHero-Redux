package models.items;

import ohero_redux.models.utilities.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.items.Supplies;

public class SuppliesTest {

    @Test
    public void testSuppliesNullConstruct() {
        Supplies test = new Supplies();
        String expected = "";
        Integer expectedNum = 1;
        assertEquals(expected, test.getName());
        assertEquals(expected, test.getDescription());
        assertEquals(expectedNum, test.getQuantity());
    }

    @Test
    public void test1SuppliesNonNullConstruct() {
        Supplies test = new Supplies("Adventurer's Pack");
        String expectedName = "Adventurer's Pack";
        String expectedDesc = "";
        Integer expectedNum = 1;
        assertEquals(expectedName, test.getName());
        assertEquals(expectedDesc, test.getDescription());
        assertEquals(expectedNum, test.getQuantity());
    }

    @Test
    public void test2SuppliesNonNullConstruct() {
        Supplies test = new Supplies("Adventurer's Pack", "Large backpack, can contain 30 lbs of items");
        String expectedName = "Adventurer's Pack";
        String expectedDesc = "Large backpack, can contain 30 lbs of items";
        Integer expectedNum = 1;
        assertEquals(expectedName, test.getName());
        assertEquals(expectedDesc, test.getDescription());
        assertEquals(expectedNum, test.getQuantity());
    }

    @Test
    public void test3SuppliesNonNullConstruct() {
        Supplies test = new Supplies("Adventurer's Pack", "Large backpack, can contain 30 lbs of items", 1);
        String expectedName = "Adventurer's Pack";
        String expectedDesc = "Large backpack, can contain 30 lbs of items";
        Integer expectedNum = 1;
        assertEquals(expectedName, test.getName());
        assertEquals(expectedDesc, test.getDescription());
        assertEquals(expectedNum, test.getQuantity());
    }

    @Test
    public void testGetSetName() {
        Supplies test = new Supplies();
        assertEquals("", test.getName());
        String expected = "Rations";
        test.setName(expected);
        assertEquals(expected, test.getName());
    }

    @Test
    public void testGetSetDescription() {
        Supplies test = new Supplies("Rations");
        assertEquals("", test.getDescription());
        String expected = "Daily food rations";
        test.setDescription(expected);
        assertEquals(expected, test.getDescription());
    }

    @Test
    public void testGetSetQuantity() {
        Supplies test = new Supplies("Rations", "Daily food rations");
        assertEquals(1, test.getQuantity());
        Integer expected = 14;
        test.setQuantity(expected);
        assertEquals(expected, test.getQuantity());
    }

    @Test
    public void testGetSummary() {
        Supplies test = new Supplies("Rations", "Daily food rations", 14);
        String expected = "Rations: Daily food rations, (14)";
        assertEquals(expected, test.itemSummary());
    }

    @Test
    public void testInstanceOfItem() {
        Supplies supplies = new Supplies();
        assertInstanceOf(Item.class, supplies);
    }

}
