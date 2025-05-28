package ohero_redux.models.items;

//won't change stats

import ohero_redux.models.utilities.Item;

public class Supplies extends Item {

    private String name;
    private String description;
    private Integer quantity;

    public Supplies() {
        this.name = "";
        this.description = "";
        this.quantity = 0;

    }

    public Supplies(String name) {
        super(name);
        this.description = "";
        this.quantity = 0;
    }

    public Supplies(String name, String description) {
        super(name, description);
        this.quantity = 0;
    }

    public Supplies(String name, String description, Integer quantity) {
        super(name, description);
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
