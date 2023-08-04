import java.util.ArrayList;
import java.util.List;

public class lastindex {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        int index = numbers.indexOf(10);
        System.out.println("The first occurence of 10 is at the index"+index);
        int lastindex =numbers.lastIndexOf(10);
        System.out.println("THE LAST OCCURECE OF 10 is athe index: "+lastindex);
        int index1 = numbers.indexOf(50);
        System.out.println("The first occurence of 50 is at the index"+index1);
    }
    
}
