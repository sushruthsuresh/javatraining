public class wrapper {

    public static void main(String[] args) {
    try{

        int data=100/10;
        System.out.println(data);
        String s = "Java";
        System.out.println(s.length());
        String a="200";
        int i=Integer.parseInt(a);
        System.out.println(i);
    }
    catch(NullPointerException e){
        System.out.println(e);
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
}
}