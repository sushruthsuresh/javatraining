import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class testjavacollection2 {
    public static void main(String[] args) {
        LinkedList<String> a1= new LinkedList<String>();
        a1.add("ravi");
        a1.add("vijay");
        a1.add("ravi");
        a1.add("Ajay");
        Iterator<String> itr=a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    
}
