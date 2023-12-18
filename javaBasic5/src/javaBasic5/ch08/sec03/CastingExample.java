package javaBasic5.ch08.sec03;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		
		Bus bus = (Bus) vehicle; // 강제형변환 (부모타입을 자식타입으로 바꿀때)
		
		bus.checkFare();
		
		CarRun cr = new CarRun();
		
		cr.drive(bus);
		
		
		// 자식객체화 사용
		Bus bus1 = new Bus();
		bus1.checkFare();
		bus1.run();
		

	}

}
