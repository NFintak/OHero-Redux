package ohero_redux.models.characters;

import ohero_redux.models.utilities.CharStats;

public abstract class Enemy extends Characters {
    //make abstract and split into 2-3 types of enemies?
    //brute, melee, boss?

    private String name;
    private CharStats stats;

    public Enemy() {
        this.name = "";
        this.stats = new CharStats();
    }

    public Enemy(String name) {
        super(name);
        this.stats = new CharStats();
    }

    public Enemy(String name, CharStats stats) {
        super(name, stats);
    }

    public String getEnemyType() {
        return this.getClass().toString();
    }

}
