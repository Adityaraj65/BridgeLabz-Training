package day13;

class Animal1{
	void walk()
	{
		System.out.println("I am walking");
	}
}
class Bird extends Animal1
{
	void fly()
	{
		System.out.println("I am flying");
	}
    void sing(){
        System.out.println("I am singing");
    }
}

public class Inheritance1{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
}
