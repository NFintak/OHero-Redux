package models.utilities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.utilities.ItemStats;

public class ItemStatsTest {

    ItemStats testStats = new ItemStats();
    ItemStats testStats2 = new ItemStats(1, 2, 3, 4, 5, 6);

    @Test
    public void testItemStatConstructs() {
        assertNotNull(testStats);
        assertNotNull(testStats2);
    }



}
