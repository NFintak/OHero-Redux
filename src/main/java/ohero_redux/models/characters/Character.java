package ohero_redux.models.characters;

import ohero_redux.models.utilities.CharStats;

public abstract class Character {
    private Long id;
    private String name;
    private CharStats stats;

    public Character(String name) {
        this.name = name;
        this.stats = new CharStats();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharStats getStats() {
        return stats;
    }

    public void setStats(CharStats stats) {
        this.stats = stats;
    }

}
