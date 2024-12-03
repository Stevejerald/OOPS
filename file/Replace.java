import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Replace{
    public static void main(String[] args) {

            File file = new File("example.txt");
            String oldword = "EMP";
            String Newword = "Mama";
        try {
            Scanner reader = new Scanner(file);
            StringBuilder content = new StringBuilder();

            while(reader.hasNextLine())
            {
                String line = reader.nextLine();
                content.append(line.replace(oldword, Newword)).append("\n");
            }
            reader.close();

            FileWriter writer = new FileWriter(file);
            writer.write(content.toString());
            writer.close();

            System.out.println("Word Replace Sucessfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}