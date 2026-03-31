package annotation.override;

// Child class
class Dog extends Animal {

    // @Override ensures this method correctly overrides the parent method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
