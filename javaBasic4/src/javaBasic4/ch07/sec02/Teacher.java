package javaBasic4.ch07.sec02;

public class Teacher extends Student{

	String major;
	
	public void teaching()
	{
		System.out.println("����ģ��");
	}
	
	public Teacher() {
		super("ȫ�浿",30,"��ǻ�Ͱ���");
		System.out.println("�ڽ� Ŭ�����Դϴ�.");
	}

	public Teacher(String name, int age, String dept, String major) {
		this.name =name;
		this.age = age;
		this.dept=dept;
		this.major = major;
	}
	
	
}
