class adder
{
    static int add(int a,int b)
    {
        return a+b;
    }

    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}

class testoverloading1
{
    public static void main(String args[])
    {
        System.out.println(adder.add(11,22));
        System.out.println(adder.add(11,22,33));

    }
}