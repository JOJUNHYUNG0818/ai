package javaBasic6.ch09.sec04;

public class Outter2Ex {

	public static void main(String[] args) {
		A a = new A();
		A.B b = new A.B();
		b.ib = b.ib + 30;
		
		

	}

}

class A{
	int ia =10;
	void iaM() {};
	static int sia = 20;
	static void siaM() {};
	
	static class B{
		int ib = 30;
		void ibM() {
			//ia=ia+20; static ����� �켱���̱� ������ �ۿ� �ν��Ͻ��� �����������.
		};
		static int sib = 40;
		static void sibM() {};
	}
}