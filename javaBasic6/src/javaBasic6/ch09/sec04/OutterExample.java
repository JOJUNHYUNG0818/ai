package javaBasic6.ch09.sec04;

public class OutterExample {

	public static void main(String[] args) {
		Outter ot = new Outter();
		Outter.Inner otIn =  ot.new Inner();
		otIn.iam();
		

		
	}

}


class Outter {
	// �ۿ� ����� �ȿ� Ŭ������ ����� �� �� ����.
	int a = 10;
	void aM() {}
	
	static int sa = 20;
	static void sam() {}

	
	class Inner{
		int ia = 100;
		void iam()	{
			// ���� Ŭ������ �ܺ� Ŭ������ ��� ����带 �� �����ִ�.
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