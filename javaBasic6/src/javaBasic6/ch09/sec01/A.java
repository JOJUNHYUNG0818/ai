package javaBasic6.ch09.sec01;

public class A {
	public static void main(String[] args){
		
		
	
	}

}


class B{
	
	int a = 10;
	void aM() {
		System.out.println(a);
		
	}
	
	static int sa = 200;
	static void saM() {
		System.out.println("sa"); 
	}
	class C{
		int b =20;
		void bM() {
			a= a+100;
			aM();
			System.out.println(b);
		}
		
		
		
	}
	
	
}