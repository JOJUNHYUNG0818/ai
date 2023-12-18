package javaBasic6.ch09.sec04;

public class OutterExample {

	public static void main(String[] args) {
		Outter ot = new Outter();
		Outter.Inner otIn =  ot.new Inner();
		otIn.iam();
		

		
	}

}


class Outter {
	// 밖에 멤버는 안에 클래스의 멤버를 쓸 수 없다.
	int a = 10;
	void aM() {}
	
	static int sa = 20;
	static void sam() {}

	
	class Inner{
		int ia = 100;
		void iam()	{
			// 내부 클래스는 외부 클래스의 모든 멤버드를 다 쓸수있다.
			ia= ia+20;
			a = a+20;
			aM();
			sa =30;
			Outter.sa = Outter.sa +10;
			Outter.sam();
			
		}
		
		
		//static int sia = 10;
		// static void siaM() {};
	}
}