package javaBasic6.ch09.sec05;

public class AnyEx1 {

	public static void main(String[] args) {
		B b = new B();
		b.bM();
		
		
		B bb = new B() { // 이름없는 자식 클래스 (익명 클래스)
			int b =20;
			
			@Override
			void bM() {
				System.out.println("이름없는 메소드 B의 자식메소드");
			}
			
		};
		bb.bM();
		
	}

}


class B{
	void bM()
	{
		System.out.println("부모메소드");
	}
}