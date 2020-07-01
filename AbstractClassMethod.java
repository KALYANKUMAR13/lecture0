
abstract class Vehicle
{
    public abstract int NoofWheel();
}
 class Bus extends Vehicle
{
    public int NoofWheel()
    {
        return 6;
    }
}
class Auto extends Vehicle
{
    public int NoofWheel()
    {
        return 3;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Bus b = new Bus();
        Auto a = new Auto();
        
        int busWheels = b.NoofWheel();
        int autoWheels = a.NoofWheel();
        System.out.println(busWheels+" "+autoWheels);
    }
}
