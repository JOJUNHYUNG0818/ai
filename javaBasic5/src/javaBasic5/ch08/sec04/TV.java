package javaBasic5.ch08.sec04;

public class TV implements Remocon{
	@Override
	public void powerOn() {
		System.out.println("8Àå 5¹ø´ä");
		
	}

	public static void main(String[] args) {
		Remocon re = new TV();
		
		re.powerOn();

	}

}
