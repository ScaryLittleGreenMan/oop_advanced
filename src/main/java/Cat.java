public class Cat extends Animals {
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void catInfo() {
        System.out.println("Cats name: " + name + " Cats color: " + color);
    }
    @Override
    public void voice (){
        System.out.println("Вызов метода из суперкласса в коте");
        super.voice();
        System.out.println("Cat meow");
    }
}
