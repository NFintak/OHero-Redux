package ohero_redux.models.items;

//most will change defense/health stat, some may change other stats
import ohero_redux.models.utilities.Item;
import ohero_redux.models.utilities.ItemStats;

public class Armor extends Item {

    private String name;
    private String description;
    private Integer quantity;
    private ItemStats stats;

    public Armor() {
        this.name = "";
        this.description = "";
        this.quantity = 1;
        this.stats = new ItemStats();
    }

    public Armor(String name) {
        super(name);
        this.description = "";
        this.quantity = 1;
        this.stats = new ItemStats();
    }

    public Armor(String name, String description) {
        super(name, description);
        this.quantity = 1;
        this.stats = new ItemStats();
    }

    public Armor(String name, String description, Integer quantity) {
        super(name, description, quantity);
        this.stats = new ItemStats();
    }

    public Armor(String name, String description, Integer quantity, ItemStats stats) {
        super(name, description, quantity);
        this.stats = stats;
    }

    public ItemStats getItemStats() {
        return stats;
    }

    public void setItemStats(ItemStats stats) {
        this.stats = stats;
    }

    public String itemSummary() {
        return String.format("%s: %s, (%s)\n%s", this.getName(), this.getDescription(), this.getQuantity(), this.getItemStats().getStatSummary());
    }

}
