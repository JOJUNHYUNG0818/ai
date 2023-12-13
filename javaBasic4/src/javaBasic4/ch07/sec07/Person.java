package javaBasic4.ch07.sec07;

// 부모 클래스			
public class Person {
	String name;
	int age;
	final static int MAX = 100; // 더이상 이 내용을 바꾸지 못한다
	
	public Person() {
		
	}
	
	public final void eat() {
		System.out.println("일반 밥을 먹는다.");
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
