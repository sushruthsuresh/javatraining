import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {

    public static void main(String[] args) {
        try{
            File myobj = new File("D:\\java\\file.txt");
            Scanner myReader = new Scanner(myobj);
            while(myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("an error occured.");
            e.printStackTrace();

        }
    }
}
