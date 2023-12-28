package javaApp4.ch16.sec04;

public class LambdaEx04 {

	public static void main(String[] args) {

		Person person = new Person();
		//방법1 인터페이스 메소드 구현(생략)
		
//      // 방법2 익명 메소드
//		Calcuable calcuable = new Calcuable() {
//			
//			@Override
//			public double calc(double x, double y) {
//				double result = Computer.staticMethod(x, y);
//				return result;
//			}
//		};
//		// 방법 3 람다식
		Calcuable calcuable = (x,y)-> Computer.staticMethod(x, y);
		// 방법 4 람다식 메소드 
		Calcuable calcuable1 = Computer::staticMethod;
		person.action(calcuable);
		person.action(calcuable1);
		
		Computer computer = new Computer();
		
		Calcuable calcuable2 = computer::instanceMethod;
		
		person.action(calcuable2);
	}

}

@FunctionalInterface // 아래있는 메소드는 추상메소드 하나다.
interface Calcuable{
	double calc (double x , double y); // 추상메소드
}

class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과: "+result);
	}
}


class Computer {
	public static double staticMethod(double x, double y) {
		return x+y;

	}
	public double instanceMethod(double x, double y) {
		return x*y;
	}
}

