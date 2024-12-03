interface Animal{
    void sound();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Dog Barks!....");
    }
}

public class Test{
    public static void main(String[] args){
        Dog sujith = new Dog();

        sujith.sound();
    }
}