package ohero_redux.models.characters;

public class NonPlayerChar extends Characters {

    private String type;

    public NonPlayerChar(String name, String type) {
        super(name);
        this.type = type;
    }

//    public String getNPCType() {
//        return type;
//    }
//
//    public void setNPCType(String type) {
//        this.type = type;
//    }

}
