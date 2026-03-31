package inheritance;
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating instances of each animal subclass   
        Animal dog=new Dog();
        dog.makeSound();
        Animal cat=new Cat();
        cat.makeSound();
        Animal bird =new Bird();
        bird.makeSound();

    }
}
// Base class
class Animal{
    String name;
    int age;
    public void makeSound(){
        System.out.println("Animal make sound ");
    }
}
// Derived classes
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
// Derived classes
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("cats make meow sound");
    }
}
// Derived classes
class Bird extends Animal{
    @Override
    public void makeSound(){
        System.out.println("bird sound :chirp");
    }
}
