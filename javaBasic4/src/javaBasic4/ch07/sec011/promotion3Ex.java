package javaBasic4.ch07.sec011;

public class promotion3Ex {

	public static void main(String[] args) {
		A a = new A();
		a.eat();
		System.out.println("-------------");
		
		B b = new B();
		A b1 = new B();
		
		b.eat();
		b1.eat();
		
		A bb = new BB();
		bb.eat();

	}
	
	

}

class A{
	void eat() {
		System.out.println("��");
	}
}

class B extends A{
	@Override
	void eat() {
		System.out.println("������");
	}
	
}

class BB extends A{
	
	@Override
	void eat() {
		System.out.println("�ܹ���");
	}
}
class C extends B{
	@Override
	void eat() {
		System.out.println("����");
	}
	
}