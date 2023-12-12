package javaBasic4.ch07.sec04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sup = new SupersonicAirplane();
		
		sup.takeOff();
		
		sup.fly();
		sup.flyMode = SupersonicAirplane.SUPERSONIC;
		sup.fly();
		sup.flyMode = SupersonicAirplane.NORMAL;
		sup.fly();
		sup.flyMode = SupersonicAirplane.ROUND;
		sup.fly();
		sup.flyMode = SupersonicAirplane.SLOW;
		sup.fly();
		
	}

}
