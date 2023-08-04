public class override {
    public static void main(String[] args) {
        {
            bike obj = new bike();
            obj.run();
        }
    }
}

class vehicle
{
    void run()
    {
        System.out.println("VEHICLES IS RUNNING!");
    }
}

class bike extends vehicle
{
    void run()
    {
        System.out.println("BIKE IS RUNNING SAFELY!");
    }
}