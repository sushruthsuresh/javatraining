public class  nullpexcep{
    public static void main(String[] args) {
    try{

        int data=100/10;
        System.out.println(data);
        String s = null;
        System.out.println(s.length());
    }
    catch(NullPointerException e){
        System.out.println(e);
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
}
}