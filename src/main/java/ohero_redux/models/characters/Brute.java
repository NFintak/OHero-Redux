package ohero_redux.models.characters;

import ohero_redux.models.utilities.CharStats;

public class Brute extends Enemy {

    private String name;
    private CharStats stats;
    private String description;

    public Brute() {
        this.name = "";
        this.stats = new CharStats();
        this.description = "";
    }

    public Brute(String name) {
        super(name);
        this.stats = new CharStats();
        this.description = "";
    }

    public Brute(String name, CharStats stats) {
        super(name, stats);
        this.description = "";
    }

    public Brute(String name, CharStats stats, String description) {
        super(name, stats);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

}
