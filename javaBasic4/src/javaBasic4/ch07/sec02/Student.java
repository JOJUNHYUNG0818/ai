package javaBasic4.ch07.sec02;

public class Student extends Person{
	
	String dept;
	
	public void study() {
		System.out.println("공부한다.");
	}

	
	public Student() {
		System.out.println("부모클래스입니다.");
	}
	
	public Student(String name, int age, String dept)
	{
		this.name = name;
		this.age = age;
		this.dept = dept;
		System.out.println("부모클래스입니다 내용이 있는 생성자"+name);
	}
}
