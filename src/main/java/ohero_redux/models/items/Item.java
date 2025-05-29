package ohero_redux.models.items;

//will change stats

import ohero_redux.models.utilities.ItemStats;

public class Item extends ohero_redux.models.utilities.Item {


    private ItemStats stats;

    public Item(String name) {
        super(name);
        this.stats = new ItemStats();
    }

}
