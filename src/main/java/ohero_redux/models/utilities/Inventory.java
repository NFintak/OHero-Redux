package ohero_redux.models.utilities;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> playerInventory;

    public Inventory() {
        playerInventory = new ArrayList<Item>();
    }

    public Inventory(ArrayList<Item> inventory) {
        playerInventory = inventory;
    }

    public ArrayList<Item> getInventory() {
        return playerInventory;
    }

    public void setInventory(ArrayList<Item> playerInventory) {
        this.playerInventory = playerInventory;
    }

    public void addItem(Item item) {
        this.playerInventory.add(item);
    }

    public Boolean checkIfEmpty() {
        return this.playerInventory.isEmpty();
    }

    public Integer inventorySize() {
        return this.playerInventory.size();
    }

}
