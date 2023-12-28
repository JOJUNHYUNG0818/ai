package javaApp4.ch16.sec04;

public class LambdaEx04 {

	public static void main(String[] args) {

		Person person = new Person();
		//���1 �������̽� �޼ҵ� ����(����)
		
//      // ���2 �͸� �޼ҵ�
//		Calcuable calcuable = new Calcuable() {
//			
//			@Override
//			public double calc(double x, double y) {
//				double result = Computer.staticMethod(x, y);
//				return result;
//			}
//		};
//		// ��� 3 ���ٽ�
		Calcuable calcuable = (x,y)-> Computer.staticMethod(x, y);
		// ��� 4 ���ٽ� �޼ҵ� 
		Calcuable calcuable1 = Computer::staticMethod;
		person.action(calcuable);
		person.action(calcuable1);
		
		Computer computer = new Computer();
		
		Calcuable calcuable2 = computer::instanceMethod;
		
		person.action(calcuable2);
	}

}

@FunctionalInterface // �Ʒ��ִ� �޼ҵ�� �߻�޼ҵ� �ϳ���.
interface Calcuable{
	double calc (double x , double y); // �߻�޼ҵ�
}

class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("���: "+result);
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

