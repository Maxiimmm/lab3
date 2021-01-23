public class Item {
    private String name;
    private Adjective adjective;

    public Item(String name,Adjective adjective){
        this.name = name;
        this.adjective = adjective;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adjective getAdjective() {
        return adjective;
    }

    public void setAdjective(Adjective adjective) {
        this.adjective = adjective;
    }
}
