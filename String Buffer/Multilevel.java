class Animal{
    void eat(){
        System.out.println("The Animal Eats Food");
    }
}

class Dog extends Animal{
    void barks(){
        System.out.println("Dog Barks");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("The Puppy Weeps");
    }
}

public class Multilevel{
    public static void main(String[] args){
        Puppy pup = new Puppy();

        pup.weep();
        pup.barks();
        pup.eat();
    }
}