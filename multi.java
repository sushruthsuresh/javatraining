public class multi {
    
}

class animal{
    void eat()
    {
        System.out.println("eating");
    }
}

class dog extends animal{
    void bark()
    {
        System.out.println("stop barking ");
    }
}

class babydog extends dog
{
    void weep()

    {
        System.out.println("weeping");
    }
}

class test
{
    public static void main(String args[])
    {
        babydog d= new babydog();
        d.weep();;
        d.bark();
        d.eat();

}
}