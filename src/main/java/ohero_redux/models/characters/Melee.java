package ohero_redux.models.characters;

import ohero_redux.models.utilities.CharStats;
import ohero_redux.models.utilities.Inventory;

public class Melee extends Enemy {

    private String name;
    private CharStats stats;
    private String description;
    private Inventory meleeInventory;

    public Melee() {
        this.name = "";
        this.stats = new CharStats();
        this.description = "";
        this.meleeInventory = new Inventory();
    }

    public Melee(String name) {
        super(name);
        this.stats = new CharStats();
        this.description = "";
        this.meleeInventory = new Inventory();
    }

    public Melee(String name, CharStats stats) {
        super(name, stats);
        this.description = "";
        this.meleeInventory = new Inventory();
    }

    public Melee(String name, CharStats stats, String description) {
        super(name, stats);
        this.description = description;
        this.meleeInventory = new Inventory();
    }

    public Melee(String name, CharStats stats, String description, Inventory inventory) {
        super(name, stats);
        this.description = description;
        this.meleeInventory = inventory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public Inventory getInventory() {
        return meleeInventory;
    }

    public void setInventory(Inventory inventory) {
        this.meleeInventory = inventory;
    }

}
