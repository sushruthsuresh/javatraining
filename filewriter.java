
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {

    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("D:\\java\\file.txt");
            myWriter.write("Files in java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("SUCCESSFULLY WROTE THIS FILE!");
        }catch( IOException e){
            System.out.println("an error occured.");
            e.printStackTrace();

        }
    }
}
