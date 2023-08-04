
import java.util.Iterator;
import java.util.Stack;

public class testjavacollection4 {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<String>();
        System.out.println("is your stack empty"+stack1.empty());
        stack1.push("Ayush");
        stack1.push("Amit");
        stack1.push("Ashish");
        stack1.push("Garima");
        System.out.println("elements on the stack"+ stack1);
        System.out.println("elements on the top of the stack"+ stack1.peek());
        System.out.println("is your stack empty "+stack1.empty());
        Iterator<String> itr =stack1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
