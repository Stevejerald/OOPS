class Main {
    // Static variable
    static int count = 0;

    // Static method
    static void displayCount() {
        System.out.println("Current count: " + count);
    }

    // Instance method
    void increment() {
        count++;
    }

    public static void main(String[] args) {
        // Access static method without creating an object
        Main.displayCount();

        Main obj1 = new Main();
        obj1.increment(); // Incrementing static variable
        Main.displayCount();

        Main obj2 = new Main();
        obj2.increment(); // Incrementing static variable
        Main.displayCount();
    }
}
