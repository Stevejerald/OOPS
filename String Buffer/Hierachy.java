class Animal{
    void eats(){
        System.out.println("This Animal Eats");
    }
}

class Dog extends Animal{
    void barks(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat Meow");
    }
}

public class Hierachy{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.barks();
        dog.eats();
        System.out.println("------------");

        cat.meow();
        cat.eats();
    }}
