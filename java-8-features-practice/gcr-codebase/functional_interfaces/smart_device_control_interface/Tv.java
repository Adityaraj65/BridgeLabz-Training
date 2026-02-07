package functional_interfaces.smart_device_control_interface;

public class Tv implements DevicesOperation {
    @Override
    public void turnOff() {
        System.out.println("tv turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("tv turned on");
    }
}
