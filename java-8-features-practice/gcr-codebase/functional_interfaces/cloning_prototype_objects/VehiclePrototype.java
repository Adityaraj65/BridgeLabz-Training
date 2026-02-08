package functional_interfaces.cloning_prototype_objects;

public class VehiclePrototype implements Cloneable {

    private String model;
    private int speed;

    public VehiclePrototype(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    // Enabling cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {

        // Calling Object's clone() method
        return super.clone();
    }

    @Override
    public String toString() {
        return "Model=" + model + ", Speed=" + speed;
    }
}

