package javaBasic4.ch07.sec03;

public class ComputerExample {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		System.out.println(cal.areaCircle(10) );
		
		//자식클래스 객체생성하기
		Computer com = new Computer();
		System.out.println(com.areaCircle(10));
	}

}
