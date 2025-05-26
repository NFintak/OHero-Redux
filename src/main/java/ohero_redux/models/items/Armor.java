package ohero_redux.models.items;

//all will change defense/health stat, some may change other stats
import ohero_redux.models.utilities.Item;
import ohero_redux.models.utilities.ItemStats;

public class Armor extends Item {

    private ItemStats stats;

    public Armor(String name) {
        super(name);
        this.stats = new ItemStats();
    }

}
