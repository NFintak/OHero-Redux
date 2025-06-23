package ohero_redux.models.characters;

import ohero_redux.models.utilities.CharStats;

public class Enemy extends Character {

    private String name;
    private Long id;
    private CharStats stats;
    private String type;

    public Enemy() {
        this.name = "";
        this.id = 0L;
        this.stats = new CharStats();
        this.type = "";
    }

    public Enemy(String name) {
        super(name);
        this.id = 0L;
        this.stats = new CharStats();
        this.type = "";
    }

    public Enemy(String name, Long id) {
        super(name, id);
        this.stats = new CharStats();
        this.type = "";
    }

    public Enemy(String name, Long id, CharStats stats) {
        super(name, id, stats);
        this.type = "";
    }

    public Enemy(String name, Long id, String enemyType) {
        super(name, id);
        this.type = enemyType;
    }

    public String getEnemyType() {
        return type;
    }

    public void setEnemyType(String enemyType) {
        this.type = enemyType;
    }
}
