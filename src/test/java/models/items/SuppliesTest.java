package models.items;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.items.Supplies;

public class SuppliesTest {

    @Test
    public void testSuppliesNullConstruct() {
        Supplies test = new Supplies();
        String expected = "";
        Integer expectedNum = 0;
        assertEquals(expected, test.getName());
        assertEquals(expected, test.getDescription());
        assertEquals(expectedNum, test.getQuantity());
    }

    @Test
    public void test1SuppliesNonNullConstruct() {
        Supplies test = new Supplies("Adventurer's Pack");
        String expectedName = "Adventurer's Pack";
        String expectedDesc = "";
        Integer expectedNum = 0;
        assertEquals(expectedName, test.getName());
        assertEquals(expectedDesc, test.getDescription());
        assertEquals(expectedNum, test.getQuantity());
    }

    @Test
    public void test2SuppliesNonNullConstruct() {
        Supplies test = new Supplies("Adventurer's Pack", "Large backpack, can contain 30 lbs of items");
        String expectedName = "Adventurer's Pack";
        String expectedDesc = "Large backpack, can contain 30 lbs of items";
        Integer expectedNum = 0;
        assertEquals(expectedName, test.getName());
        assertEquals(expectedDesc, test.getDescription());
        assertEquals(expectedNum, test.getQuantity());
    }

}
