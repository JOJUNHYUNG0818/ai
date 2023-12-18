package javaBasic7.ch11.sec02.ex01;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		try {
			
		
		A a = new A();
		a.a1();
		
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage()+" 분모가 0 오류");
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
			finally {
		}
			System.out.println("로그오프하기");
		

	}

}

class A{
	void a1() throws ArithmeticException, ArrayIndexOutOfBoundsException,NullPointerException{
		a2();
	}
	void a2() throws ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException{
		a3();
		printLength("java");
		printLength(null);
	}
	static void printLength(String data) {
		int result = data.length();
		System.out.println("문자수는 "+result);
	}
	
	void a3() throws ArithmeticException, ArrayIndexOutOfBoundsException{
		a4();
		double[] dArr = {1.1, 2.2, 3.3};
		System.out.println(dArr[2]);
	}
	void a4()  throws ArithmeticException{
		
		int a = 10;
		a=a/5; // 예외발생
		System.out.println(a);
	}
}
