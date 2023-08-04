abstract class shape {
    
    abstract void draw();
}

class rectangle extends shape
{
    void draw()
    {
        System.out.println("DRAWING RECTAGLE");
    }
}
class circle extends shape
{
    void draw()
    {
        System.out.println("DRAWING CIRCLE");
    }
}
public class abstraction{
    public static void main(String[] args) {
        rectangle r= new rectangle();
        r.draw();
        circle c= new circle();
        c.draw();
        shape s1 = new rectangle();
        s1.draw();
        shape s2= new circle();
        s2.draw();
    }
}