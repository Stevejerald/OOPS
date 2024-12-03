// Custom Exception Class
class TemperatureException extends Exception {
    public TemperatureException(String message) {
        super(message);
    }
}

// Main Class
public class ReactorApp {
    public static void main(String[] args) {
        int temperature = 45; // Example temperature

        try {
            if (temperature > 40) {
                throw new TemperatureException("Temperature too high!");
            }
            System.out.println("Temperature is normal.");
        } catch (TemperatureException e) {
            System.out.println("Warning: " + e.getMessage());
        }
    }
}
