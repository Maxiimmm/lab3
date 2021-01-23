public class Head {
    private String name;
    boolean highOriented=false;
    public Head(String name, boolean highOriented){
        this.name=name;
        this.highOriented=highOriented;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHighOriented() {
        return highOriented;
    }

    public void setHighOriented(boolean highOriented) {
        this.highOriented = highOriented;
    }
    public void raise(){
        if (highOriented==true){
        System.out.println("with head held high");
        }
        else{
            System.out.println("head down ");
        }
    }
}
