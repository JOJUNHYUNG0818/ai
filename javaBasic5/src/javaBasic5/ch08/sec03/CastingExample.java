package javaBasic5.ch08.sec03;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle; // ��������ȯ (�θ�Ÿ���� �ڽ�Ÿ������ �ٲܶ�)
		
		bus.checkFare();
		
		CarRun cr = new CarRun();
		
		cr.drive(bus);
		

	}

}
