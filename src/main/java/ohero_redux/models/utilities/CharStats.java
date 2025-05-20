package ohero_redux.models.utilities;

public class CharStats {
    private Integer dexterity;
    private Integer energy;
    private Integer strength;
    private Integer intellect;
    private Integer health;
    private Integer charisma;

    public CharStats(Integer dexterity, Integer energy, Integer strength,
                     Integer intellect, Integer health, Integer charisma) {
        this.dexterity = dexterity;
        this.energy = energy;
        this.strength = strength;
        this.intellect = intellect;
        this.health = health;
        this.charisma = charisma;
    }

    public CharStats() {
        this.dexterity = 0;
        this.energy = 0;
        this.strength = 0;
        this.intellect = 0;
        this.health = 0;
        this.charisma = 0;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer incrDex(Integer mod) {
        return this.dexterity += mod;
    }

    public Integer decrDex(Integer mod) {
        if (this.dexterity - mod < 0) {
            return this.dexterity = 0;
        } else {
            return this.dexterity -= mod;
        }
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer incrEnergy(Integer mod) {
        return this.energy += mod;
    }

    public Integer decrEnergy(Integer mod) {
        if (this.energy - mod < 0) {
            return this.energy = 0;
        } else {
            return this.energy -= mod;
        }
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer incrStrength(Integer mod) {
        return this.strength += mod;
    }

    public Integer decrStrength(Integer mod) {
        return this.strength -= mod;
    }

    public Integer getIntellect() {
        return intellect;
    }

    public void setIntellect(Integer intellect) {
        this.intellect = intellect;
    }

    public Integer incrIntellect(Integer mod) {
        return this.intellect += mod;
    }

    public Integer decrIntellect(Integer mod) {
        return this.intellect -= mod;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer incrHealth(Integer mod) {
        return this.health += mod;
    }

    public Integer decrHealth(Integer mod) {
        return this.health -= mod;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public Integer incrCharisma(Integer mod) {
        return this.charisma += mod;
    }

    public Integer decrCharisma(Integer mod) {
        return this.charisma -= mod;
    }

}
