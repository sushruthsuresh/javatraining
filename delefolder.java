import java.io.File;
import java.util.Scanner;

public class delefolder {
    public static void main(String[] args) {
        
    String filepath;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a diretory  path for deleting instruction");
    filepath = sc.nextLine();
    sc.close();
    File file = new File(filepath);
    try{
        deleteDirectory (file);
        file.delete();
        System.out.println("Your directory is deleted successfully!");
    }

    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    }


public static void deleteDirectory(File file){
for(File subfile:file.listFiles())
{
    if(subfile.isDirectory()){
        deleteDirectory(subfile);

    }
    subfile.delete();
}

}
}