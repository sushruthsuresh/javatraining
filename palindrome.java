public class palindrome {
    public static void main(String[] args) {
        
        int n=3553,rev=0,rem,og=n;

        while(n!=0){

            rem= n%10;
            rev=rev*10+ rem;
            n=n/10;
        }
        if(og==rev){
            System.out.println(og+" is a palindrome");
        }
        else{
            System.out.println(og+" is not a palindrome");
        }
    }
    
}
