public class righttriagle {
    public static void main(String[] args) {

        int s=5;
        for(int i =0;i<s;i++)
        {
            for(int j=1;j<s-i;j++)
            {
                System.out.print(" ");

            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(k+1);
            }
            System.out.println();
        }

    }

}
