import java.io.FileWriter;

public class Write{
    public static void main(String[] args){
        try {
          FileWriter writer = new FileWriter("example.txt");
            writer.write("EDEN PIXEL SOLUTIONS \n Steve Jerald - CEO \n Sibyll Dominic - CTO\n Vasanth Sandeep - COO\n Sujith VV - EMP");
            writer.close();
            System.out.println("File Wroted Sucessfully");
        } 
        catch(Exception e){
            System.out.println(e);
        }
    }
}