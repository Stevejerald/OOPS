import java.util.Scanner;

public class MultiExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(scanner.nextLine()); // Might throw NumberFormatException

            System.out.print("Enter a divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());

            int result = num / divisor; // Might throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Program execution complete.");
        }
    }
}
