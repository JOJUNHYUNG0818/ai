package javaBasic3.ch06.sec10;

public class CarExample {

	public static void main(String[] args) {

		// ù��°
		Car myCar = new Car();
		
		System.out.println("�𵨸� : "+myCar.model);
		System.out.println("����ӵ� : "+myCar.speed);
		
		// �ι���
		Car sCar  = new Car("�Ｚ�ڵ���","SM3","���", 370,0);
		
		sCar.speed=100;
		
		System.out.println("ȸ���: "+sCar.company);
		System.out.println("�𵨸�: "+sCar.model);
		System.out.println("����: "+sCar.color);
		System.out.println("�ְ�ӵ�: "+sCar.maxSpeed);
		System.out.println("����ӵ�: "+sCar.speed);
		
		
		
		Car sCar1  = new Car("�����ڵ���","�ҳ�Ÿ","������", 350,0);
		
		System.out.println("ȸ���: "+sCar1.company);
		System.out.println("�𵨸�: "+sCar1.model);
		System.out.println("����: "+sCar1.color);
		System.out.println("�ְ�ӵ�: "+sCar1.maxSpeed);
		System.out.println("����ӵ�: "+sCar1.speed);
		
		
		// ����°
		Car car3 = new Car();
		
		car3.setCompany("�����ڵ���");
		car3.setModel("BMW");
		car3.setColor("������");
		car3.setMaxSpeed(300);
		car3.setSpeed(0);
	}

}
