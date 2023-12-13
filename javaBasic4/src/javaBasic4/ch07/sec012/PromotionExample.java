package javaBasic4.ch07.sec012;
import java.util.Scanner;


public class PromotionExample {

	public static void main(String[] args) {
		
		PromotionExample p = new PromotionExample();
		p.meunDisplay();
		int choice = p.meunChoice();
		p.output(choice);
		
	}
	
	public void meunDisplay() {
		// �޴��� �޼ҵ�
		System.out.println("--------------------------");
		System.out.println("1.�� 2.������ 3.�ܹ��� 4.����");
		System.out.println("--------------------------");
	}
	
	public int meunChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��� �ֹ��ϼ��� > ");
		int choice;
		choice = sc.nextInt();
		return choice;
	}

	
	public void output(int choice) {
		// �ֹ��� �޴� ������
		switch (choice) {
		case 1: A a = new A(); a.eat(); break;
		case 2: B b = new B(); b.eat(); break;
		case 3: BB bb = new BB(); bb.eat(); break;
		case 4: C c = new C(); c.eat(); break;
		default : System.out.println("1~4�� ���ÿ�"); return;
		}
		System.out.println(" ���ְԵ弼��.");
	}
}

class A{
	void eat() {
		System.out.print("��");
	}
}

class B extends A{
	@Override
	void eat() {
		System.out.print("������");
	}
	
}

class BB extends A{
	
	@Override
	void eat() {
		System.out.print("�ܹ���");
	}
}
class C extends B{
	@Override
	void eat() {
		System.out.print("����");
	}
	
}