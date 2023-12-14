package javaBasic4.ch07.sec015;

public class PhoneExample {

	public static void main(String[] args) {
		Calling call = new Calling();
		
		IPhone iPhone = new IPhone();
		call.callTurnOff(iPhone);
		
		SmartPhone smartP = new SmartPhone();
		call.callTurnOn(smartP);

		
		
	}

}
