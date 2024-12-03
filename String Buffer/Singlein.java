class Animal{
    void eat(){
        System.out.println("The Animals eat food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks");
    }
}

public class Singlein{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}