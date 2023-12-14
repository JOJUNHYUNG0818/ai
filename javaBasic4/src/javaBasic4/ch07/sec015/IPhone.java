package javaBasic4.ch07.sec015;

public class IPhone extends Phone{

	@Override
	public void turnOff() {
		System.out.println("아이폰을 끕니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("아이폰을 켭니다");
		
	}
}
