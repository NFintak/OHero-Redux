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

    public Boss(String name, CharStats stats) {
        super(name, stats);
        this.description = "";
        this.inventory = new Inventory();
        this.loot = new Items();
    }

    public Boss(String name, CharStats stats, String description) {
        super(name, stats);
        this.description = description;
        this.inventory = new Inventory();
        this.loot = new Items();
    }

    public Boss(String name, CharStats stats, String description, Inventory inventory) {
        super(name, stats);
        this.description = description;
        this.inventory = inventory;
        this.loot = new Items();
    }

    public Boss(String name, CharStats stats, String description, Inventory inventory, Items loot) {
        super(name, stats);
        this.description = description;
        this.inventory = inventory;
        this.loot = loot;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Items getLoot() {
        return loot;
    }

    public void setLoot(Items loot) {
        this.loot = loot;
    }

}
