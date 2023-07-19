public class result {
    public static void main(String[] args) {
        int a=12,b=12,c=7,d=5;
        int r1,r2,r3;
        System.out.println("Value of a:"+a);
        r1=++a;
        System.out.println("After increment of a:"+r1);
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);
        r2=--b;
        System.out.println("After decrement of a:"+r2);
        System.out.println("Value of b:"+b);
        System.out.println("Value of c:"+c);
        r3=c++;
        System.out.println("After decrement of a:"+r3);
        System.out.println("Value of d:"+d);
        System.out.println("Value of c:"+c);
    }
}
