package javaApp1.ch12.sec04;

public class WrapperEx {

	public static void main(String[] args) {
		
		// 자료형 기본형: byte char int long boolean float double
		
		//  ""  참조형: String 클래스의 변수 

		// 기본형은 클래스가 아니므로 미리 만들어진 메소드가 없다. 그래서 기본형 자료형을 클래스로 만들어 둔게 있다. (포장클래스)
		
		// 박싱= 기본형--> 객체, 언박싱 객체-->기본형

		Integer a = 10; // 참조형 변수
		// = Integer a = new Integer(10);
		String strA =a.toString(); // 숫자 10을 문자 "10"으로 바꿈
		double da = a.floatValue();
		System.out.println(da);
		System.out.println(a.MAX_VALUE);
		System.out.println(a.MIN_VALUE);
		System.out.println(a.SIZE);
		
		Double b = 3.14;
	    System.out.println(b.MAX_VALUE);
	    System.out.println(b.SIZE);
		

	}

}
