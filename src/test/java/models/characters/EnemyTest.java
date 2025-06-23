package models.characters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.characters.Enemy;
import ohero_redux.models.utilities.CharStats;
import ohero_redux.models.utilities.Inventory;
import ohero_redux.models.items.Items;

public class EnemyTest {

    @Test
    public void testNullConstructor() {
        Enemy troll = new Enemy();
        assertNotNull(troll);
    }

    @Test
    public void testNonNullConstructor1() {
        Enemy troll = new Enemy("Blinky");
        assertNotNull(troll);
    }

    @Test
    public void testNonNullConstructor2() {
        Enemy troll = new Enemy("Blinky", 123L);
        assertNotNull(troll);
    }

    @Test
    public void testNonNullConstructor3() {
        Enemy troll = new Enemy("Blinky", 123L, new CharStats());
        assertNotNull(troll);
    }

    @Test
    public void testNotNullConstructor4() {
        Enemy troll = new Enemy("Blinky", 123L, new CharStats(), "Mid-sized");
        assertNotNull(troll);
    }
}
