class Car{
    String brand;
    String color;

    void display(){
        System.out.println("Brand: "+ brand);
        System.out.println("Color: "+ color);
    }
}

public class ClassAndObj{
    public static void main(String[] args) {
        {
            Car car1 = new Car();

            car1.brand = "BMW";
            car1.color = "White";
            car1.display();
        }
    }
}