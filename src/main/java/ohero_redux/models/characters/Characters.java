package ohero_redux.models.characters;

import ohero_redux.interfaces.HealthCheck;
import ohero_redux.models.utilities.CharStats;

public abstract class Characters implements HealthCheck {
    private Long id;
    private String name;
    private CharStats stats;

    public Characters() {
        this.name = "";
        this.id = 0L;
        this.stats = new CharStats();
    }

    public Characters(String name) {
        this.name = name;
        this.id = 0L;
        this.stats = new CharStats();
    }

    public Characters(String name, Long id) {
        this.name = name;
        this.id = id;
        this.stats = new CharStats();
    }

    public Characters(String name, CharStats stats) {
        this.name = name;
        this.stats = stats;
    }

    public Characters(String name, Long id, CharStats stats) {
        this.name = name;
        this.id = id;
        this.stats = stats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
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

    public String characterSummary() {
        return this.getName() + "\n" + this.stats.statsSummary();
    }

    public String getHealthStatus() {
        return String.format("%s/%s", this.getStats().getTempHealth(), this.getStats().getTotalHealth());
    }

}
