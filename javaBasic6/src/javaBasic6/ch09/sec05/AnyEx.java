package javaBasic6.ch09.sec05;

public class AnyEx {

	public static void main(String[] args) {
		AA aa = new AA(); //이름있는 자식 클래스 객체화
		aa.iaM();
		// 자식이름 없이 자식클래스 객체화하기 - 익명 자식객체
		A a = new A() {
			@Override
			void iaM() {
				System.out.println("이름없는 자식클래스 내용 부모객체화에 {} 넣고 바로 자식 클래스를 만듬");
				
			}
		};
		
		a.iaM();
		
		A a1 = new A();
		
		a1.iaM();
		

	}

}


class A{
	void iaM() {
		System.out.println("부모클래스");
	}
	
}

class AA extends A{
	@Override
	void iaM() {
		System.out.println("자식클래스- 이름있다");
	}
}