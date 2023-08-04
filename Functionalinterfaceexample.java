import test_2.sayable;

interface sayable
{
    void say(String msg);
    default void show()
    {
        System.out.println("Show method");
    }
     static void hello()
    {
        System.out.println("hello");
    }
}


public class Functionalinterfaceexample 
    implements sayable{
        public void say(String msg)
        {
            System.out.println(msg);
        }
        public static void main(String[] args) {
            Functionalinterfaceexample fie= new Functionalinterfaceexample();
            fie.say("Hello there");
            fie.show();
            sayable.hello();
        }
    }

