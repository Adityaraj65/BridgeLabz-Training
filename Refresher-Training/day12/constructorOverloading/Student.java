package day12.constructorOverloading;

import java.util.Scanner;

public class Student {
	String name ;
	int age ;
	String course;
	public Student() {
		this.name="unknown";
		this.age=0;
		this.course="Not Assigned";
	}
	public Student(String name) {
		this.name=name;
		this.age=18;
		this.course="general Studies";
	}
	public Student(String name,int age , String course) {
		this.name=name;
		this.age=age;
		this.course=course;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int age=sc.nextInt();
		String course=sc.next();
		Student s=new Student();
		Student s2=new Student(name);
		Student s3=new Student(name,age,course);
		System.out.println("Name : "+s.name+", Age : "+s.age+", Course : "+s.course);
		System.out.println("Name : "+s2.name+", Age : "+s2.age+", Course : "+s2.course);
		System.out.println("Name : "+s3.name+", Age : "+s3.age+", Course : "+s3.course);
	}
}
