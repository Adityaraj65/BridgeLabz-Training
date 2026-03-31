package functional_interfaces.cloning_prototype_objects;

public class PrototypeApp {

    public static void main(String[] args) {

        try {
            VehiclePrototype original =
                    new VehiclePrototype("ElectricCar", 120);

            // Cloning the object
            VehiclePrototype copy =
                    (VehiclePrototype) original.clone();

            System.out.println("Original: " + original);
            System.out.println("Clone   : " + copy);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}

