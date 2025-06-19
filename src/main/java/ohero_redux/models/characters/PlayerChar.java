package ohero_redux.models.characters;

import ohero_redux.models.utilities.Inventory;
import ohero_redux.models.utilities.CharStats;

public class PlayerChar extends Character {

    private String name;
    private Long id;
    private CharStats stats;
    private Inventory playerInventory;

    public PlayerChar() {
        this.name = "";
        this.id = 0L;
        this.stats = new CharStats();
        this.playerInventory = new Inventory();
    }

    public PlayerChar(String name) {
        super(name);
        this.id = 0L;
        this.stats = new CharStats();
        this.playerInventory = new Inventory();
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

}
