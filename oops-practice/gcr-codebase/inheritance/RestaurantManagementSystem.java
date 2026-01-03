package inheritance;

public class RestaurantManagementSystem {
    public static void main(String[] args) {

        // Creating chef and waiter objects
        Chef chef = new Chef("Aditya ", 11);
        Waiter waiter = new Waiter("Saket", 21);

        // Displaying details and duties
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        waiter.displayDetails();
        waiter.performDuties();
    }
}

// Common parent class
class Person {

    // Basic details every person has
    String name;
    int id;

    // Set name and id
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Show person details
    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

// Interface to define work behavior
interface Worker {

    // Any worker must perform duties
    void performDuties();
}

// Chef is a Person and also a Worker
class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    // Chef's specific work
    @Override
    public void performDuties() {
        System.out.println("Duty : Cooking food in the kitchen");
    }
}

// Waiter is a Person and also a Worker
class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    // Waiter's specific work
    @Override
    public void performDuties() {
        System.out.println("Duty : Serving food to customers");
    }
}

