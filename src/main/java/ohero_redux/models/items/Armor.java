package ohero_redux.models.items;

//all will change defense/health stat, some may change other stats
import ohero_redux.models.utilities.Item;
import ohero_redux.models.utilities.ItemStats;

public class Armor extends Item {

    private String name;
    private String description;
    private ItemStats stats;

    public Armor(String name) {
        super(name);
        this.description = "";
        this.stats = new ItemStats();
    }

    public Armor(String name, String description) {
        super(name, description);
        this.stats = new ItemStats();
    }

    public Armor(String name, String description, ItemStats stats) {
        super(name, description);
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
