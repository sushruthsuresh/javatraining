public class studentdc {
    int roll;
    String st;
    double m1,m2,m3;
    studentdc()
    {
        roll=1001;
        st="Roy";
        m1=80.0;
        m2=80.0;
        m3=90.0;
    }
}

    class Main{
        public static void main(String[] args) {
            studentdc s1=new studentdc();
            System.out.println(s1.roll+" "+s1.st+" "+s1.m1);
            System.out.println(s1.m2+" "+s1.m3);
            studentdc s2=new studentdc();
            System.out.println(s2.roll+" "+s2.st+" "+s2.m1);
            System.out.println(s2.m2+" "+s2.m3);
        }
    }


