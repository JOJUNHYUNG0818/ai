package javaBasic6.ch09.sec01;

public class Example {

	public static void main(String[] args) {
		AA a1 = new AA();
		System.out.println(a1.aa);
		
		System.out.println(AA.sa);

	}

}


class AA{
	int aa = 20;
	void aaM() {
		
		
		
	}
	static int sa =10;
	static void saM() {
		
	}
	
	static class BB{
		static int bb = 30;
		static void sbbM() {
			
		}
		
		int ibb =40;
		void ibbM() {
			
		}
	}
	
	class CC{
		int cc=50;
		void ccM() {
			
		}
		
		//static int sc=20;  ->사용불가
	}
}
