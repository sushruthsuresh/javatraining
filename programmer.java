public class programmer extends emp{
    int bonus=10000;
}
class single
{
    public static void main(String args[])
    {
        programmer p=new programmer();
        System.out.println("programmer salary: "+p.salary );
        System.out.println("programmer salary: "+p.bonus );

    }
}
import java.util.*;

class ArrMinMax {
    public static void main() {
        Scanner inp = new Scanner(System.in);
        System.out.print("\n Enter Size of Array: ");
        int n = inp.nextInt();
        int i, sum = 0;
        int arr[] = new int[n]; //Creating N-size Array

        for (i = 0; i < n; i++) { //Entering N numbers in array
            System.out.print("\n Enter: ");
            arr[i] = inp.nextInt();
        }

        int max_element = arr[0], min_element = arr[0]; //Initializing with first element.

        for (i = 0; i < n; i++) {
            if (arr[i] > max_element) { //Checking Maximum element
                max_element = arr[i];
            }

            if (arr[i] < min_element) { //Checking Minimum element
                min_element = arr[i];
            }
        }

        //Printing Result
        System.out.println("\n Maximum Number: " + max_element);
        System.out.println("\n Minimum Number: " + min_element);
    }
}