package module_6_oop_basics.cat;

public class Main {

    //Solution for exercise 6.8.3

    public static void main(String args[]) {
        Cat albatros = new Cat("Котовас");
        albatros.speak();
    }
}
class Animal {

    private String name;
    private String voice;

    public Animal(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        System.out.println(this.name + " говорит " + this.voice);
    }
}
class Cat extends Animal {

    public Cat(String name){
        super(name, "мяу");
    }
}
