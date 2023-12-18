package javaBasic6.ch09.sec05;

public class AnyEx2 {

	public static void main(String[] args) {
		CImpl ci = new CImpl();
		ci.cM();
		
		C ci2 = new CImpl();
		ci2.cM();
		
		
		C ci3 = new C() { //인터페이스는 new 를 할 수없다. 하지만 익명클래스 생성은 가능 
			@Override
			public void cM() {
				System.out.println("익명구현클래스이 메소드");
				
			}
		}; // new 객체() {내용 @override} ; = 익명객체 구조 
		
		ci3.cM();

	}

}


interface C{
	abstract void cM(); // 추상 메소드
}

class CImpl implements C{
	@Override
	public void cM() {
		System.out.println("구현클래스 (자식) 메소드");
		
	}
	
	
}