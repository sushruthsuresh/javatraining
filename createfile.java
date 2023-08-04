import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {
        try{
            java.io.File myobj = new File("D:\\java\\file.txt");
            if(myobj.createNewFile()){
                System.out.println("File created: "+myobj.getName());
            }
            else{
                System.out.println("File already exists!");
            }
        }
        catch(IOException e){
            System.out.println("a error occured.");
            e.printStackTrace();

        }
    }
}
