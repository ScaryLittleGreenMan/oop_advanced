public class Cat extends Animal {
    String name;
    String color;
    static int count;

    public Cat() {
        count++;
    }

    public Cat(String name, String color) {
        this(); //без этой фигни реально не считает, инициализирует счетчик
        this.name = name;
        this.color = color;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(color + " " + name + " run");
        } else {
            System.out.println(color + " " + name + " run 200 meters and die(((");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0) {
            System.out.println("Cat can't swim and drowned");
            System.out.println("Why you hate cats?!");
        } else {
            System.out.println("Number incorrect");
        }
    }

    public void getCatCount() {
        System.out.println("Cat count: " + count);
    }
}
