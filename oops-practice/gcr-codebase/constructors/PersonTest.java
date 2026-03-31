package constructors;

public class PersonTest {

	public static void main(String[] args) {
        // Create Person objects
		Person p1 = new Person("Aditya", 22);
        Person p2 = new Person(p1);   // cloning p1

        p1.display();
        p2.display();

	}

}
class Person {
    String name;
    int age;

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
// Method to display person details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
