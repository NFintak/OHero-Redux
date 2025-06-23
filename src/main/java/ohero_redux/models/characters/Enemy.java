package ohero_redux.models.characters;

public class Enemy extends Character {

    private String name;
    private Long id;
    private String type;

    public Enemy() {
        this.name = "";
        this.id = 0L;
        this.type = "";
    }

    public Enemy(String name) {
        super(name);
        this.id = 0L;
        this.type = "";
    }

    public Enemy(String name, Long id) {
        super(name, id);
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
