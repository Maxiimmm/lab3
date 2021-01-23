public class Theater implements TakingPlace{

    private final String name;
    private Place place;

    public  Theater(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void changePlace(Place place) {
        this.place = place;
    }

    @Override
    public Place getPlace() {
        return place;
    }

    public void floated(Adverb adverb){
        changePlace(Place.FOREST);
        System.out.println(getName() + " floated " + adverb + " in the " + getPlace());
    }

}
