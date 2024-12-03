import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of terms: ");
        int terms = scanner.nextInt();
        int first = 0;
        int secound = 1;

        System.out.print("Fibonacci Series:\n");
        for(int i = 0; i<terms; i++){
            System.out.print(first + " ");
            int next = first + secound;
            first = secound;
            secound = next;
        }
    }
}