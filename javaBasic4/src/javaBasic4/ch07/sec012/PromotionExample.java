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
		// 메뉴판 메소드
		System.out.println("--------------------------");
		System.out.println("1.밥 2.떡볶이 3.햄버거 4.피자");
		System.out.println("--------------------------");
	}
	
	public int meunChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 주문하세요 > ");
		int choice;
		choice = sc.nextInt();
		return choice;
	}

	
	public void output(int choice) {
		// 주문한 메뉴 나가기
		switch (choice) {
		case 1: A a = new A(); a.eat(); break;
		case 2: B b = new B(); b.eat(); break;
		case 3: BB bb = new BB(); bb.eat(); break;
		case 4: C c = new C(); c.eat(); break;
		default : System.out.println("1~4를 고르시오"); return;
		}
		System.out.println(" 맛있게드세요.");
	}
}

class A{
	void eat() {
		System.out.print("밥");
	}
}

class B extends A{
	@Override
	void eat() {
		System.out.print("떡볶이");
	}
	
}

class BB extends A{
	
	@Override
	void eat() {
		System.out.print("햄버거");
	}
}
class C extends B{
	@Override
	void eat() {
		System.out.print("피자");
	}
	
}