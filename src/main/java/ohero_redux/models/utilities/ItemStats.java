package ohero_redux.models.utilities;

public class ItemStats {

    private Integer dexMod;
    private Integer energyMod;
    private Integer strMod;
    private Integer intelMod;
    private Integer totalHealthMod;
    private Integer charismaMod;

    public ItemStats() {
        this.dexMod = 0;
        this.energyMod = 0;
        this.strMod = 0;
        this.intelMod = 0;
        this.totalHealthMod = 0;
        this.charismaMod = 0;
    }

    public ItemStats(Integer dexMod, Integer energyMod, Integer strMod,
                     Integer intelMod, Integer totalHealthMod, Integer charismaMod) {
        this.dexMod = dexMod;
        this.energyMod = energyMod;
        this.strMod = strMod;
        this.intelMod = intelMod;
        this.totalHealthMod = totalHealthMod;
        this.charismaMod = charismaMod;
    }

    public Integer getDexMod() {
        return dexMod;
    }

    public void setDexMod(Integer mod) {
        this.dexMod = mod;
    }

    public Integer getEnergyMod() {
        return energyMod;
    }

    public void setEnergyMod(Integer mod) {
        this.energyMod = mod;
    }

    public Integer getStrengthMod() {
        return strMod;
    }

    public void setStrengthMod(Integer mod) {
        this.strMod = mod;
    }

    public Integer getIntellectMod() {
        return intelMod;
    }

    public void setIntellectMod(Integer mod) {
        this.intelMod = mod;
    }

    public Integer getTotalHealthMod() {
        return totalHealthMod;
    }

    public void setTotalHealthMod(Integer mod) {
        this.totalHealthMod = mod;
    }

    public Integer getCharismaMod() {
        return charismaMod;
    }

    public void setCharismaMod(Integer mod) {
        this.charismaMod = mod;
    }

}
