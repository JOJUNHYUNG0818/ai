package javaBasic4.ch07.sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		p.bell();
		p.sendVoice("����");
		p.receiveVoice("����");
		
		SmartPhone sp = new SmartPhone();
		
		sp.sendVoice("����");
		sp.receiveVoice("����");
		sp.hangUp();
		
		SmartPhone sp2 = new SmartPhone("������","���");
		
		System.out.println(sp2.model); 
		sp2.setWifi(true);
		
		System.out.println(sp2.model+"�� �������̰� �ȵ˴ϴ�.");
		
		System.out.print(sp2.model+"�� "+sp2.color+"�̰� ");
		p.bell();
		
		System.out.print(sp2.model+"�� �޼����� �Խ��ϴ�.\n");
		sp2.sendVoice("�ڵ��� ���?");
		
		
		
		
		
		
	}

}
