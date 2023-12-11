package javaBasic3.ch06.sec011;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		calculator.powerOn();
		calculator.powerOff();
		calculator.plus(500, 300);
		System.out.println(calculator.plus(500,300));
		System.out.println(calculator.plus(-200,100));
		System.out.println(calculator.plus(100, 200, 300));
	}

}
