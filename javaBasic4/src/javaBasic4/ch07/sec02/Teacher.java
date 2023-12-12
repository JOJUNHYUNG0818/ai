package javaBasic4.ch07.sec02;

public class Teacher extends Student{

	String major;
	
	public void teaching()
	{
		System.out.println("가르친다");
	}
	
	public Teacher() {
		super("홍길동",30,"컴퓨터공학");
		System.out.println("자식 클래스입니다.");
	}

	public Teacher(String name, int age, String dept, String major) {
		this.name =name;
		this.age = age;
		this.dept=dept;
		this.major = major;
	}
	
	
}
