package javaBasic4.ch07.sec014;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Texi texi = new Texi();
		driver.drive(texi);

		
		System.out.println(bus instanceof Bus);
		System.out.println(texi instanceof Texi); // Texi��� ���� ������ Texi ��� ��ü�� ���� ���� ��������? ���� Ű���
		//System.out.println(texi instanceof Bus); �ȵ�
		System.out.println(bus instanceof Vehicle);
		
	}

}

