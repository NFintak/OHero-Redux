package models.items;

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
//        Weapon test = new Weapon("", "");
//        assertNotNull(test);
    }

    @Test
    public void test3NonNullConstructor() {
//        Weapon test = new Weapon("", "", 0);
//        assertNotNull(test);
    }

    @Test
    public void test4NonNullConstructor() {
//        Weapon test = new Weapon("", "", 0, new ItemStats());
//        assertNotNull(test);
    }

}
