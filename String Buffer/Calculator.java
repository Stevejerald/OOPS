import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1,num2;
        char operation;

        System.out.println("Enter the 1st Number: ");
        num1 = scanner.nextDouble();

        System.out.println("\nEnter the 2nd Number: ");
        num2 = scanner.nextDouble();

        System.out.println("Enter the Operation to do calculation");
        operation = scanner.next().charAt(0);
        
        switch(operation){
            case '+':
                System.out.println("ANS:" + (num1 + num2));
                break;
            case '-':
                System.out.println("ANS:" + (num1 - num2));
                break;
            case '*':
                System.out.println("ANS:" + (num1 * num2));
                break;
            case '/':
                System.out.println("ANS:" + (num1 / num2));
                break;
            case '%':
                System.out.println("ANS:" + (num1 % num2));
                break;

        }
    }
    
}