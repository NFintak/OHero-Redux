package ohero_redux.models.characters;

import ohero_redux.models.utilities.CharStats;

public class Enemy extends Character {
    //make abstract and split into 2-3 types of enemies?
    //brute, melee, boss?

    private String name;
    private CharStats stats;
    private String type;

    public Enemy() {
        this.name = "";
        this.stats = new CharStats();
        this.type = "";
    }

    public Enemy(String name) {
        super(name);
        this.stats = new CharStats();
        this.type = "";
    }

    public Enemy(String name, CharStats stats) {
        super(name, stats);
        this.type = "";
    }

    public Enemy(String name, CharStats stats, String enemyType) {
        super(name, stats);
        this.type = enemyType;
    }

    public String getEnemyType() {
        return type;
    }

    public void setEnemyType(String enemyType) {
        this.type = enemyType;
    }
}
