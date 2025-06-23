package ohero_redux.models.utilities;

public class CharStats {
    private Integer dexterity;
    private Integer energy;
    private Integer strength;
    private Integer intellect;
    private Integer tempHealth;
    private Integer totalHealth;
    private Integer charisma;

    public CharStats(Integer dexterity, Integer energy, Integer strength,
                     Integer intellect, Integer health, Integer charisma) {
        this.dexterity = dexterity;
        this.energy = energy;
        this.strength = strength;
        this.intellect = intellect;
        this.tempHealth = health;
        this.totalHealth = health;
        this.charisma = charisma;
    }

    public CharStats() {
        this.dexterity = 0;
        this.energy = 0;
        this.strength = 0;
        this.intellect = 0;
        this.tempHealth = 0;
        this.totalHealth = 0;
        this.charisma = 0;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public void incrDex(Integer mod) {
        this.dexterity += mod;
    }

    public void decrDex(Integer mod) {
        if (this.dexterity - mod < 0) {
            this.dexterity = 0;
        } else {
            this.dexterity -= mod;
        }
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public void incrEnergy(Integer mod) {
        this.energy += mod;
    }

    public void decrEnergy(Integer mod) {
        if (this.energy - mod < 0) {
            this.energy = 0;
        } else {
            this.energy -= mod;
        }
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public void incrStrength(Integer mod) {
        this.strength += mod;
    }

    public void decrStrength(Integer mod) {
        if (this.strength - mod < 0) {
            this.strength = 0;
        } else {
            this.strength -= mod;
        }
    }

    public Integer getIntellect() {
        return intellect;
    }

    public void setIntellect(Integer intellect) {
        this.intellect = intellect;
    }

    public void incrIntellect(Integer mod) {
        this.intellect += mod;
    }

    public void decrIntellect(Integer mod) {
        if (this.intellect - mod < 0) {
            this.intellect = 0;
        } else {
            this.intellect -= mod;
        }
    }

    public Integer getTempHealth() {
        return tempHealth;
    }

    public void setTempHealth(Integer health) {
        if (health > this.totalHealth) {
            this.tempHealth = health;
            this.totalHealth = health;
        } else {
            this.tempHealth = health;
        }
    }

    public void incrTempHealth(Integer mod) {
        this.tempHealth += mod;
    }

    public void decrTempHealth(Integer mod) {
        if (this.tempHealth - mod < 0) {
            this.tempHealth = 0;
        } else {
            this.tempHealth -= mod;
        }
    }

    public Integer getTotalHealth() {
        return totalHealth;
    }

    public void setTotalHealth(Integer health) {
        this.totalHealth = health;
    }

    public void incrTotalHealth(Integer mod) {
        this.totalHealth += mod;
    }

    public void decrTotalHealth(Integer mod) {
        if (this.totalHealth - mod < 0) {
            this.totalHealth = 0;
        } else {
            this.totalHealth -= mod;
        }
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public void incrCharisma(Integer mod) {
        this.charisma += mod;
    }

    public void decrCharisma(Integer mod) {
        if (this.charisma - mod < 0) {
            this.charisma = 0;
        } else {
            this.charisma -= mod;
        }
    }

    public String statsSummary() {
        String summary = "Dexterity: " + this.getDexterity() + "\nEnergy: " + this.getEnergy()
                + "\nStrength: " + this.getStrength() + "\nIntellect: " + this.getIntellect()
                + "\nHealth: " + this.getTempHealth() + "/" + this.getTotalHealth()
                + "\nCharisma: " + this.getCharisma();
        return summary;
    }

}
