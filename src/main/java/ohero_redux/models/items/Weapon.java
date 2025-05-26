package ohero_redux.models.items;

//might change stats, depends on weapon
import ohero_redux.models.utilities.Item;
import ohero_redux.models.utilities.ItemStats;

public class Weapon extends Item {

    private ItemStats stats;

    public Weapon(String name) {
        super(name);
        this.stats = new ItemStats();
    }

}
