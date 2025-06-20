package ohero_redux.models.items;

//will change stats

import ohero_redux.models.utilities.ItemStats;

public class Items extends ohero_redux.models.utilities.Item {

    private String name;
    private String description;
    private Integer quantity;
    private ItemStats stats;

    public Items() {
        this.name = "";
        this.description = "";
        this.quantity = 1;
        this.stats = new ItemStats();
    }

    public Items(String name) {
        super(name);
        this.description = "";
        this.quantity = 1;
        this.stats = new ItemStats();
    }

    public Items(String name, String description) {
        super(name, description);
        this.quantity = 1;
        this.stats = new ItemStats();
    }

    public Items(String name, String description, Integer quantity) {
        super(name, description, quantity);
        this.stats = new ItemStats();
    }

    public Items(String name, String description, Integer quantity, ItemStats stats) {
        super(name, description, quantity);
        this.stats = stats;
    }

    public ItemStats getItemStats() {
        return stats;
    }

    public void setItemStats(ItemStats stats) {
        this.stats = stats;
    }

    //add override for itemSummary, include item stats
    public String itemSummary() {
        return String.format("%s: %s, (%s)\n%s", this.getName(), this.getDescription(), this.getQuantity(), this.getItemStats().getStatSummary());
    }

}
