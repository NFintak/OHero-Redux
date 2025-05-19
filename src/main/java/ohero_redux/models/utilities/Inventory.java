package ohero_redux.models.utilities;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> playerInventory;

    public Inventory() {
        playerInventory = new ArrayList<Item>();
    }

    public ArrayList<Item> getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(ArrayList<Item> playerInventory) {
        this.playerInventory = playerInventory;
    }

    public void addToInventory(Item item) {
        this.playerInventory.add(item);
    }

}
