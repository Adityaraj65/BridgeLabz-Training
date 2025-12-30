import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of the circle ");
        double radius=sc.nextDouble();
        // Create Circle object with radius 2.5
        Circle circle = new Circle(radius);

        // Display area and circumference
        circle.displayDetails();
    }
    
}
class Circle{
	private double radius;
	//constructor to initialize the radius
	public Circle(double radius) {
		this.radius=radius;
	}
	//getter method for radius
	public double getRadius() {
		return radius;
	}
	//setter method for radius
	public void setRadius(double radius) {
		this.radius=radius;
	}
	//Method to calculate area of the circle
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	//method to calculate circumference of the circle
	public double calculateCircumference() {
		return 2*Math.PI*radius;
	}
	   // Method to display area and circumference
    public void displayDetails() {
        System.out.printf("Area of circle: %.4f%n", calculateArea());
        System.out.printf("Circumference of circle: %.4f%n", calculateCircumference());
    }
}
