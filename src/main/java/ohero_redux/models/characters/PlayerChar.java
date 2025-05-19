package ohero_redux.models.characters;

import ohero_redux.models.utilities.Inventory;

public class PlayerChar extends Character {

    private Inventory playerInventory;

    public PlayerChar(String name) {
        super(name);
        this.playerInventory = new Inventory();
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

}
