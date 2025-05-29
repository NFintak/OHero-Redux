package ohero_redux.models.utilities;

public abstract class Item {

    private String name;
    private String description;
    private Integer quantity;

    public Item() {
        this.name = "";
        this.description = "";
        this.quantity = 0;
    }

    public Item(String name) {
        this.name = name;
        this.description = "";
        this.quantity = 0;
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
        this.quantity = 0;
    }

    public Item(String name, String description, Integer quantity) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String itemSummary() {
        return String.format("%s: %s, (%s)", this.getName(), this.getDescription(), this.getQuantity());
    }

}
