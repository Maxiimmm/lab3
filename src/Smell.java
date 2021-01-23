public class Smell {
    private Adjective adjective;
    private String name;
    private Place place;

    public Smell(String name,Adjective adjective){
        this.name = name;
        this.adjective = adjective;
    }


    public Adjective getAdjective() {
        return adjective;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void filledIn(Place place, Adverb adverb){
        Item rowan = new Item("rowan",Adjective.BLOOMING);
        System.out.print(adverb + " ");
        System.out.println(getAdjective().toString() + " " + getName() + ' ' + rowan.getAdjective().toString() + ' ' + rowan.getName() + " filled in " + place.toString());
    }
}
