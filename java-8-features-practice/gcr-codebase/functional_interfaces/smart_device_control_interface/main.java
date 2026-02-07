package functional_interfaces.smart_device_control_interface;

public class main {
    public static void main(String[] args) {
        //creating devices object
        Ac a=new Ac();
        Light l=new Light();
        Tv t=new Tv();
        //controlling devices
        a.turnOff();
        t.turnOff();
        l.turnOff();
        a.turnOn();
        t.turnOn();
        l.turnOn();

    }
}
