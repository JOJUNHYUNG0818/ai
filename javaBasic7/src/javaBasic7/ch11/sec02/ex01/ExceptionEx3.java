package javaBasic7.ch11.sec02.ex01;

public class ExceptionEx3 {

	public static void main(String[] args)  {
		try {
			B b = new B();
			b.b1();
			
		} catch (ArithmeticException e ) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("DB 종료");
			System.out.println("프로그램 종료");
		}
	
		

	}

}


class B{
	void b1() throws ArithmeticException {
		b2();
	}
	void b2() throws ArithmeticException {
		int a=10;
		a=a/0;
		
	}
}