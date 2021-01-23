public class Emma extends Human {

    public Emma(String name, Head head) {
        super(name, head);
    }

    public void snatched(Adverb adverb) {
    System.out.println(getName() + ' ' + adverb + " snatched ");
    }

    public void shuffled(Adverb adverb){
        changePlace(Place.CORNER);
        System.out.println("shuffled " + adverb + ' ' + getPlace() );
    }

    public void thundered(Adverb adverb){
        super.setName("She");
        changePlace(Place.THERE);
        System.out.println( getName()+ ' ' + adverb + " thundered " + getPlace());
    }

    public void toSweep(Adverb adverb,Adverb adverb1){
        Item broom = new Item("broom",Adjective.BIG);
        System.out.println("and " + adverb + " began to sweep " + adverb1 + " with a " + broom.getAdjective() + ' ' + broom.getName());
    }

}
