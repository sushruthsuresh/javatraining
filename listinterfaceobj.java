import java.util.ArrayList;
import java.util.List;

public class listinterfaceobj {
    public static void main(String[] args) {
        List<Integer> m1=new ArrayList<Integer>();
        m1.add(0,11);
        m1.add(1,12);
        System.out.println("m1 data"+m1);
        List<Integer> m2= new ArrayList<Integer>();
        m2.add(1);
        m2.add(2);
        m2.add(3);
        System.out.println("m2 data"+m2);
        m1.addAll(m2);
        System.out.println("m1 data"+m1);
        m1.removeAll(m2);
        System.out.println("m1 data"+m1);
        m1.remove(1);
        System.out.println("M1 Data "+m1);
        System.out.println("Retrieve index 3 data from m1"+m1.get(0));
        m1.set(0,5);
        System.out.println(m1);
    }
}
