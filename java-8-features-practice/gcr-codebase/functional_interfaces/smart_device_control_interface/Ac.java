package functional_interfaces.smart_device_control_interface;

public class Ac implements DevicesOperation {
    @Override
    public void turnOff() {
        System.out.println("ac turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("ac turned on");
    }
}
