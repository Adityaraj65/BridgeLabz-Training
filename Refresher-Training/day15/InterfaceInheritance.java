package day15;
interface Animal{
	int MAX_AGE=20;
	void eat();
}
interface Pet extends Animal{
	void play();
}
class Dog implements Pet{
	@Override
	public void eat() {
		System.out.println("eating");
	}
	@Override
	public void play() {
		System.out.println("playing max age is "+MAX_AGE);
	}
}
public class InterfaceInheritance {
	public static void main(String[] args) {
	
      Dog d=new Dog() ;
      d.play();
      d.eat();
      System.out.println(Animal.MAX_AGE);
	}  
}
