package javaBasic4.ch07.sec015;

public class SmartPhone extends Phone{

	@Override
	public void turnOff() {
		System.out.println("스마트폰을 끕니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}
}
