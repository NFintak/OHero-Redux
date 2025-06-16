package models.utilities;

import ohero_redux.models.items.Armor;
import ohero_redux.models.items.Items;
import ohero_redux.models.items.Supplies;
import ohero_redux.models.items.Weapon;
import java.util.ArrayList;
import ohero_redux.models.utilities.Inventory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.utilities.Item;

public class InventoryTest {

    Armor armor = new Armor();
    Items item = new Items();
    Supplies supplies = new Supplies();
    Weapon weapon = new Weapon();


    @Test
    public void testInventoryNullConstructor() {
        Inventory inventory = new Inventory();
        assertNotNull(inventory);
        assertTrue(inventory.checkIfEmpty());
    }

    @Test
    public void testInventoryConstructor() {
        ArrayList<Item> arrList = new ArrayList<>();
        Inventory inventory = new Inventory(arrList);
        assertNotNull(inventory);
        assertTrue(inventory.checkIfEmpty());
    }

    @Test
    public void testGetSetInventory() {
        ArrayList<Item> list = new ArrayList<>();
        Inventory inventory = new Inventory();
        inventory.setInventory(list);
        assertEquals(list, inventory.getInventory());
    }

    @Test
    public void testAddItems() {
        Inventory inventory = new Inventory();
        inventory.addItem(armor); inventory.addItem(item);
        inventory.addItem(supplies); inventory.addItem(weapon);
        assertFalse(inventory.checkIfEmpty());
    }

    @Test
    public void testInventorySize() {
        Inventory inventory = new Inventory();
        assertEquals(0, inventory.inventorySize());
        inventory.addItem(armor); inventory.addItem(weapon);
        assertEquals(2, inventory.inventorySize());
    }

}
