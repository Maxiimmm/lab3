public class Mu extends Human{

    public Mu(String name,Head head){
        super(name,head);
    }

    public void meet(Place place,Animal animal){
        changePlace(Place.CARPET);
        System.out.println("baby " + getName() + " " + "met on the " + getPlace() + " of the " + place + " " + animal.getLongname());
    }



}
