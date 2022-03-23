public class Animals {
    String name;

    public Animals() {
    }

    public Animals(String name) {
        this.name = name;
    }

    public void animalsInfo() {
        System.out.println("Animals " + name);
    }

    public void jump(){
        System.out.println("Animal jump! ");
    }

    public void voice(){
        System.out.println("Animal make something noise");
    }
}
