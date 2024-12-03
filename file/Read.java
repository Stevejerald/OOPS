import java.io.*;
import java.util.Scanner;

public class Read{
    public static void main(String[] args) {
        try {
            File data = new File("example.txt");
            Scanner reader = new Scanner(data);
            while(reader.hasNextLine())
            {
                String value = reader.nextLine();
                System.out.println(value);
            }
            reader.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}