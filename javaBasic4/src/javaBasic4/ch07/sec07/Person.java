package javaBasic4.ch07.sec07;

// �θ� Ŭ����			
public class Person {
	String name;
	int age;
	final static int MAX = 100; // ���̻� �� ������ �ٲ��� ���Ѵ�
	
	public Person() {
		
	}
	
	public final void eat() {
		System.out.println("�Ϲ� ���� �Դ´�.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
