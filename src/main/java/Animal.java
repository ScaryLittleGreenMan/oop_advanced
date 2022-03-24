public abstract class Animal {
    String name;
    static int count; //если статик не поставить, сбрасывает счетчик

    public Animal() {
        count++;
    }

    public void getAnimalCount() {
        System.out.println("Animal count: " + count);
    }

    public Animal(String name) {
        this(); //for counter work!!!
        this.name = name;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

}
