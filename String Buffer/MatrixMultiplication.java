import java.util.Scanner;

public class MatrixMultiplication{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the matrix:");
        int size = scanner.nextInt();

        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        int[][] result = new int[size][size];

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.println("Enter value for Matrix 1[" + i + "]"+"["+j+"]");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.println("Enter value for Matrix 2 [" + i + "]"+"["+j+"]");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}