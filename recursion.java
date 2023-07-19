public class recursion {
    static int sd(int n)
    {
        return n==0?0:n%10+sd(n/10);
    }

    public static void main (String args[])
    {
        int n=687;
        System.out.println(sd(n));
    }
    
}
