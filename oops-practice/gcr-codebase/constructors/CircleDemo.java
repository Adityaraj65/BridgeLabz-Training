
public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circles circle1= new Circles();
		Circles circle2=new Circles(12.0);
		System.out.println("Default Circle Area: " + circle1.calculateArea());
        System.out.println("Custom Circle Area : " + circle2.calculateArea());

	}

}
class Circles{
	double radius;
	Circles(){
		this(1.0);
	}
	Circles(double radius){
		this.radius=radius;
	}
	double calculateArea() {
		return Math.PI*radius*radius;
	}
}