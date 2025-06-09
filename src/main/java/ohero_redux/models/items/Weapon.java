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
        this.quantity = 0;
        this.stats = new ItemStats();
    }

    public Weapon(String name) {
        super(name);
        this.description = "";
        this.quantity = 0;
        this.stats = new ItemStats();
    }

}
