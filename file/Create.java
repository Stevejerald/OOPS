
import java.io.File;

public class Create{
    public static void main(String[] args) {
        try {
            File data = new File("Test.txt");
            if(data.createNewFile()){
                System.out.println("File Created Sucessfully");
            }
            else{
                System.out.println("File Already Exist");
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}