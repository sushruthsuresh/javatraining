import java.io.File;
import java.util.Scanner;
public class newfolder {
    public static void main(String[] args) {
        System.out.println("Enter the path where you want to create a folder: ");
        Scanner sc= new Scanner(System.in);
        String path=sc.next();
        System.out.println("Enter the name of the desired a directory: ");
        path= path+sc.next();
        File f1 = new File(path);
        boolean bool=f1.mkdir();
        if(bool){
            System.out.println("Folder is created sucessfully");
        }
        else{
            System.out.println("ERROR Found");
        }

    }
    
}
