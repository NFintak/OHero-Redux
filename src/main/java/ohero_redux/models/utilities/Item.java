package ohero_redux.models.utilities;

public abstract class Item {

    private String name;
    private String description;

    public Item(String name) {
        this.name = name;
        this.description = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String itemSummary() {
        return this.getName() + "\n" + this.getDescription();
    }

}
