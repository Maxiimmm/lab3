public class Human extends Creature{
    private String name;
    private Head head;

    public Human(String name, Place place) {
        super(name, place);
    }


    public Human(String name, Head head) {
        super(name);
        this.head = head;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void noticed(Adverb adverb)
    {
        Emma emma = new Emma("Emma", new Head("head", false));
        Mu mu = new Mu("Mu",new Head("name",false));
        System.out.println(adverb + " " + emma.getName() + ", " + mu.getName() + " noticed, what " );
    }
}
