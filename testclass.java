public class testclass {
    public static void main(String[] args) {
        calculator calc= new calculator();
        int addResult=calc.add(43,79);
        System.out.println("ADD RESULT: "+addResult);
        try{
            double divResult = calc.divide(15, 0);
            System.out.println("DIVISION RESULT: "+divResult);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
    }
    
}
