import java.util.Scanner;

public class multiply {
    public static void main(String args[]) {
        int n;
        try (Scanner se = new Scanner(System.in)) {
            System.out.println("enter a number:");
            n = se.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }

    }
}
