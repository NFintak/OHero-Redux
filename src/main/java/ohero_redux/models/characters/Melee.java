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



}
