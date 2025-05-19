package ohero_redux.models.characters;

public class Enemy extends Character {

    private String type;

    public Enemy(Long id, String name, String enemyType) {
        super(name);
        this.type = enemyType;
    }

    public String getEnemyType() {
        return type;
    }

    public void setEnemyType(String enemyType) {
        this.type = enemyType;
    }
}
