public class He {
    private String name;
    private Paw paw=new Paw("paw");
    private Animal animal=new Animal("fish");

    public He(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Paw getPaw() {
        return paw;
    }


    public class Paw{
        private String name;

        public void at(Animal fish){
            System.out.println("at " +He.this.getName()+ ' '+ fish.getName()+ " of " + paw.getName());
        }

        public String getName() {
            return name;
        }

        public Paw(String name){
            this.name=name;
        }

        public Animal getAnimal() {
            return animal;
        }
    }
}
