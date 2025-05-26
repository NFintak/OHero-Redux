package ohero_redux.models.utilities;

public abstract class Item {

    private String name;
    private ItemStats stats;

    public Item(String name) {
        this.name = name;
        this.stats = new ItemStats();
    }

}
