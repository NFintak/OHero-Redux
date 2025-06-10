package ohero_redux.models.items;

//might change stats, depends on weapon
import ohero_redux.models.utilities.Item;
import ohero_redux.models.utilities.ItemStats;

public class Weapon extends Item {

    private String name;
    private String description;
    private Integer quantity;
    private ItemStats stats;

    public Weapon() {
        this.name = "";
        this.description = "";
        this.quantity = 1;
        this.stats = new ItemStats();
    }

    public Weapon(String name) {
        super(name);
        this.description = "";
        this.quantity = 1;
        this.stats = new ItemStats();
    }

    public Weapon(String name, String description) {
        super(name, description);
        this.quantity = 1;
        this.stats = new ItemStats();
    }

    public Weapon(String name, String description, Integer quantity) {
        super(name, description, quantity);
        this.stats = new ItemStats();
    }

    public Weapon(String name, String description, Integer quantity, ItemStats stats) {
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
