package javaBasic3.ch06.sec10;

public class CarExample {

	public static void main(String[] args) {

		// 첫번째
		Car myCar = new Car();
		
		System.out.println("모델명 : "+myCar.model);
		System.out.println("현재속도 : "+myCar.speed);
		
		// 두번쨰
		Car sCar  = new Car("삼성자동차","SM3","흰색", 370,0);
		
		sCar.speed=100;
		
		System.out.println("회사명: "+sCar.company);
		System.out.println("모델명: "+sCar.model);
		System.out.println("색상: "+sCar.color);
		System.out.println("최고속도: "+sCar.maxSpeed);
		System.out.println("현재속도: "+sCar.speed);
		
		
		
		Car sCar1  = new Car("현대자도차","소나타","검정색", 350,0);
		
		System.out.println("회사명: "+sCar1.company);
		System.out.println("모델명: "+sCar1.model);
		System.out.println("색상: "+sCar1.color);
		System.out.println("최고속도: "+sCar1.maxSpeed);
		System.out.println("현재속도: "+sCar1.speed);
		
		
		// 세번째
		Car car3 = new Car();
		
		car3.setCompany("독일자동차");
		car3.setModel("BMW");
		car3.setColor("검정색");
		car3.setMaxSpeed(300);
		car3.setSpeed(0);
	}

}
