package questionBank;
class Car{
	int speed;
	int numberOfTyres;
	Car(int speed,int numberOfTyres){
		this.speed=speed;
		this.numberOfTyres=numberOfTyres;
		
	}
	public  void accelerate() {
		this.speed=this.speed+1;
	}
	public int  speed() {
		return speed;
	}
}
class BMW extends Car{
	BMW(int speed,int numberOfTyres){
		super(speed, numberOfTyres);
	}
	@Override
	public void accelerate() {
		speed=speed+3;
		System.out.println("speed is accelerated now speed is :"+speed);
	}
	
}
public class CarAndBmwInheritance {
	public static void main(String[] args) {
		BMW b=new BMW(70, 4);
		   System.out.println("current speed is : "+b.speed());
	      b.accelerate();
	      b.accelerate();
	}
      
}
