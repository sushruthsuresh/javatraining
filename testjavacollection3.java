import java.util.Vector;

public class testjavacollection3 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        v.addElement("Rohith");
        System.out.println(v.capacity());
        String s1=v.firstElement();
        System.out.println("First element in the list: "+s1);
        String s2=v.firstElement();
        System.out.println("Second element in the list: "+s2);
        Iterator<String> itr =v.iterator();

    }
}
