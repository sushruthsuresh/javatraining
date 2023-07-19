public class ternary
{
    public static void main (String args[])
    {
	   int a=35,b=25,c=45,max;
        max=(a>b)?(a>c?a:b):(b>c?b:c);
        System.out.println("Max number " +a+ "," +b+ "and" +c+ " is "+max);
	}

}