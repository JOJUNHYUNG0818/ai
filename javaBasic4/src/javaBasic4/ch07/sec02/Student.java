package javaBasic4.ch07.sec02;

public class Student extends Person{
	
	String dept;
	
	public void study() {
		System.out.println("�����Ѵ�.");
	}

	
	public Student() {
		System.out.println("�θ�Ŭ�����Դϴ�.");
	}
	
	public Student(String name, int age, String dept)
	{
		this.name = name;
		this.age = age;
		this.dept = dept;
		System.out.println("�θ�Ŭ�����Դϴ� ������ �ִ� ������"+name);
	}
}
