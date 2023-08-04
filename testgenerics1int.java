import java.util.*;
public class testgenerics1int {
   public static void main(String[] args) {
    ArrayList<Integer> list= new ArrayList<Integer>();
    list.add(11);
    list.add(12);
    list.add(13);
    list.add(14);
    list.add(15);
    list.add(16);
    list.add(17);
    list.add(18);
    list.add(19);
    list.add(20);
    

    Integer s= list.get(1);
    System.out.println("element is: "+s);

    System.out.println("Iterate across the data");
    Iterator<Integer> itr = list.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
   } 
}
