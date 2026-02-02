package annotation;
// Parent class
class Animal {

    // Method that will be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    // @Override ensures this method correctly overrides the parent method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class OverrideAnnotation {
    public static void main(String[] args) {

        // Creating object of Dog class
        Dog dog = new Dog();

        // Calling overridden method
        dog.makeSound();
    }
}

