package models.utilities;

import ohero_redux.models.items.Armor;
import ohero_redux.models.items.Items;
import ohero_redux.models.items.Supplies;
import ohero_redux.models.items.Weapon;
import ohero_redux.models.utilities.Inventory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class InventoryTest {

    @BeforeEach
    public void setUp() {
        Armor armor = new Armor();
        Items item = new Items();
        Supplies supplies = new Supplies();
        Weapon weapon = new Weapon();
    }
}
