package javaApp4.ch16.sec01;

public class LambdaEx {

	public static void main(String[] args) {
		
		// 방법 1.
		InterImpl inter01 = new InterImpl();
		inter01.a();
		
		// 방법 2. 익명구현
		Inter01 inter001 =  new Inter01() {
			
			@Override
			public void a() {
			System.out.println("익명 인터페이스로 구현한 메소드");	
			}
		};
		
		inter001.a();
		
		// 방법 3. 람다식 조건) 인터페이스안에 추상메소드가 1개밖에 없는 경우만 가능
		Inter01 lamda001 = ()->{
			System.out.println("람다식으로 구현한 메소드");
		};
		
		lamda001.a();
	}

}


interface Inter01{
	void a();
}
interface Inter02{
	void b();
}

class InterImpl implements Inter01{
	@Override
	public void a() {
		System.out.println("인터페이스를 구현한 메소드");
		
	}
}

