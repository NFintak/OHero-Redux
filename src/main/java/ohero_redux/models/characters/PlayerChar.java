package ohero_redux.models.characters;

import ohero_redux.models.utilities.Inventory;
import ohero_redux.models.utilities.CharStats;
import ohero_redux.interfaces.HealthCheck;

public class PlayerChar extends Characters implements HealthCheck{

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

    public PlayerChar(String name, Long id) {
        super(name, id);
        this.stats = new CharStats();
        this.playerInventory = new Inventory();
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

}
