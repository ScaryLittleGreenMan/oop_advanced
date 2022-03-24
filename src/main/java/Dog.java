public class Dog extends Animal {
    String name;
    String color;
    static int count;

    public Dog() {
        count++;
    }

    public Dog(String name, String color) {
        this();
        this.name = name;
        this.color = color;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(color + " " + name + " run " + distance + " meters");
        } else {
            System.out.println(color + " " + name + " run " + distance + " meters and die(((");
        }
        if (distance < 0) {
            System.out.println("Number incorrect");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Number incorrect");
            return;
        }
        if (distance <= 10) {
            System.out.println(color + " " + name + " swim " + distance + " meters");
        } else {
            System.out.println(color + " " + name + " swim " + distance + " meters and drowned(((");
        }
    }

    public void getDogCount() {
        System.out.println("Dog count: " + count);
    }
}
