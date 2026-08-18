package day13;
class Animal{
	void eat(String name) {
		System.out.println(name+" is eating");
	}
}
class Mammal extends Animal{
	void walk(String name) {
		System.out.println(name+" is walking");
		
	}
}
class Dog extends Mammal {
	void bark(String name) {
		System.out.println(name+"is barking ");
	}
}
class puppy extends Dog{
	void play(String name) {
		System.out.println(name+" is playing");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		puppy p=new puppy();
		p.eat("woofie");
		p.walk("woofie");
		p.bark("woofie");
		p.play("woofie");
	}
}
