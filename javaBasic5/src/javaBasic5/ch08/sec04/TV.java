package javaBasic5.ch08.sec04;

public class TV implements Remocon{
	@Override
	public void powerOn() {
		System.out.println("8�� 5����");
		
	}

	public static void main(String[] args) {
		Remocon re = new TV();
		
		re.powerOn();

	}

}
