public class studentpc {
    
    studentpc(int roll,String st)
    {
        roll=roll1;
        st=st1;
    }

    class Main{
        public static void main(String[] args) {
            studentpc s1=new studentpc(1001,"Rohith");
            System.out.println(s1.roll +" "+s1.st+" "+s1.m1);
            System.out.println(s1.m2+" "+s1.m3);
            studentdc s2=new studentdc();
            System.out.println(s2.roll+" "+s2.st+" "+s2.m1);
            System.out.println(s2.m2+" "+s2.m3);
        }
    }

}
