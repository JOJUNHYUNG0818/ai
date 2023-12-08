package javaBasic3.ch06.sec3;

public class 정적클래스 {
	static int st = 10;

	public static void main(String[] args) {

		m1();
		
		
		정적클래스 s1 = new 정적클래스();
		s1.m2();
		System.out.println(st);
		
	}

	static void m1() {	
		System.out.println("123");
	}
	
	void m2() {
		System.out.println("456");
	}
}
