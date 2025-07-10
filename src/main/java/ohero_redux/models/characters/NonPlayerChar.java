package ohero_redux.models.characters;

import ohero_redux.models.utilities.CharStats;

public class NonPlayerChar extends Characters {

    private String name;
    private CharStats stats;
    private String type;

    public NonPlayerChar() {
        this.name = "";
        this.stats = new CharStats();
        this.type = "";
    }

    public NonPlayerChar(String name) {
        super(name);
        this.stats = new CharStats();
        this.type = "";
    }

    public NonPlayerChar(String name, CharStats stats) {
        super(name, stats);
        this.type = "";
    }

    public NonPlayerChar(String name, CharStats stats, String type) {
        super(name);
        this.stats = stats;
        this.type = type;
    }

    public String getNPCType() {
        return type;
    }

    public void setNPCType(String type) {
        this.type = type;
    }

}
