public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "Brown");
        Cat cat2 = new Cat("Vasya", "Black");
        cat1.run(151);
        cat1.swim(1);

        Dog dog1 = new Dog("Bobik", "White");
        dog1.run(600);
        dog1.swim(11);
        cat1.getAnimalCount();
        cat1.getCatCount();
        dog1.getDogCount();
    }
}
