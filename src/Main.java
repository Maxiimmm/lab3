public class Main {
    public static void main(String[] args) {
        Emma emma = new Emma("Emma",new Head("head",true));
        emma.snatched(Adverb.SO);
        He he = new He("his");
        He.Paw paw = he.new Paw("paw");
        paw.at(paw.getAnimal());
        emma.getHead().raise();
        emma.changePlace(Place.CORNER);
        emma.shuffled(Adverb.OWN);


        emma.thundered(Adverb.ALONG_WHILE);
        emma.toSweep(Adverb.FINALLY,Adverb.DILIGENTLY);


        Smell smell = new Smell("smell",Adjective.SHARP);
        smell.filledIn(Place.HALL,Adverb.IN_THE_EVENING);


        for (int i = 0; i < (int)(Math.random() * 3+3); i++) {
            Bird bird = new Bird("bird");
            Animal spider = new Animal("spider");
            bird.fly();
            bird.huntSpider(spider);
        }


        Mu mu = new Mu("mu",new Head("head",false));
        Animal ant = new Animal("Ant",Adjective.SCARY,Adjective.BIG);
        mu.meet(Place.HALL,ant);


        mu.noticed(Adverb.ONLY_NOW);
        emma.noticed(Adverb.ONLY_NOW);
        Theater theater = new Theater("theater");
        theater.floated(Adverb.ALREADY);


    }
}
