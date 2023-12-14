package javaBasic4.ch07.sec014;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Texi texi = new Texi();
		driver.drive(texi);

		
		System.out.println(bus instanceof Bus);
		System.out.println(texi instanceof Texi); // Texi라는 참조 변수로 Texi 라는 객체를 참조 연결 가능한지? 묻는 키언어
		//System.out.println(texi instanceof Bus); 안됨
		System.out.println(bus instanceof Vehicle);
		
	}

}

