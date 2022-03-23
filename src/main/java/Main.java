public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals("Friend");
        Cat cat = new Cat("Barsik", "brown");
        Dog dog = new Dog();

        animal.animalsInfo();
        cat.animalsInfo();
        cat.catInfo();

        animal.voice();
        cat.voice();
        dog.voice();

    }
}
