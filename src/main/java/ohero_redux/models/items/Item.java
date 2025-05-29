package ohero_redux.models.items;

//will change stats

import ohero_redux.models.utilities.ItemStats;

public class Item extends ohero_redux.models.utilities.Item {

    private String name;
    private String description;
    private Integer quantity;
    private ItemStats stats;

    public Item() {
        this.name = "";
        this.description = "";
        this.quantity = 0;
        this.stats = new ItemStats();
    }

    public Item(String name) {
        super(name);
        this.description = "";
        this.quantity = 0;
        this.stats = new ItemStats();
    }

    //add additional constructors?

    //add override for itemSummary, include item stats

}
