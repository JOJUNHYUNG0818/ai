package javaApp4.ch16.sec02;

public class LambdaEx2 {

	public static void main(String[] args) {
		// 익명 클래스
		A a = new A() {
			
			@Override
			public int aM(int a, double b) {
				
				return (int)(a+b);
			}
		};
		
		
		System.out.println(a.aM(10, 5.5));
		
		//람다식
		A a1 = (i,j)->{	return (int)(i+j);	};
		System.out.println(a1.aM(10, 20));
		
		B b1 = (x,y,z)->{
			System.out.println("이름은 "+x);
			System.out.println("키는 "+y);
			System.out.println("성별 "+z);
		};
		
		b1.bM("홍길동", 170, true);

	}

}
//@~~ 어노테이션 바로 아레에 있는 객체를 성격을 제한할 때 사용함.
// @FuntionalInterface 인터페이스안에 추상메소드가 1개만 있다 라는 성격
@FunctionalInterface
interface A {
	int aM(int a ,double b);
}

@FunctionalInterface

interface B{
	void bM(String x, Integer y , Boolean z);
	
}