package json_data;

import com.fasterxml.jackson.databind.ObjectMapper;
class Car {

    private String brand;
    private String model;
    private int year;

    // Default constructor (required by Jackson)
    public Car() {
    }

    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class CarToJson {

    public static void main(String[] args) {
        try {
            // Create Car object
            Car car = new Car("Toyota", "Camry", 2022);

            // Convert Java object to JSON
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(car);

            // Print JSON
            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
