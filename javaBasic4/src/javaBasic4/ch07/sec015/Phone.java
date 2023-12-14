package javaBasic4.ch07.sec015;

public abstract class Phone {
	String owner;
	
	public Phone() {
	}
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public abstract void turnOn();
	
	public abstract void turnOff(); 

	public void call() {
		System.out.println("전화합니다.");
	}
}
