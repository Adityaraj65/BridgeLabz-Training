package functional_interfaces.smart_device_control_interface;

public class Light implements DevicesOperation {
    @Override
    public void turnOff() {
        System.out.println("light turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("light turned on");
    }
}
