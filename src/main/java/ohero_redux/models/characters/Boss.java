package ohero_redux.models.characters;

import ohero_redux.models.utilities.CharStats;
import ohero_redux.models.utilities.Inventory;
import ohero_redux.models.items.Items;

public class Boss extends Enemy {

    private String name;
    private CharStats stats;
    private String description;
    private Inventory inventory;
    private Items loot;

    public Boss() {
        this.name = "";
        this.stats = new CharStats();
        this.description = "";
        this.inventory = new Inventory();
        this.loot = new Items();
    }

    public Boss(String name) {
        super(name);
        this.stats = new CharStats();
        this.description = "";
        this.inventory = new Inventory();
        this.loot = new Items();
    }

}
