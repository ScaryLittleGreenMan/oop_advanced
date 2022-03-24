public abstract class Animal {
    String name;
    static int count; //если статик не поставить, сбрасывает счетчик

    public Animal() {
        count++;
    }

    public int getAnimalCount() {
        System.out.println("Animal count: " + count);
        return count;
    }

    public Animal(String name) {
        this(); //for counter work!!!
        this.name = name;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

}
