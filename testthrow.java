public class testthrow {
    {
        public static void main(String[] args) {
            if(age<18)
            {
                throw new ArithmeticException("Perso is not eligible to vote.")
            }
            else{
                System.out.println("Person is eligible to vote!!");
            }
        }
        public static void main(String[] args) {
            
            try{
                validate(13);
            }
            catch(ArithmeticException)
            {
                System.out.println(e);
            }
            System.out.println("rest of code");
        }
    }
}
