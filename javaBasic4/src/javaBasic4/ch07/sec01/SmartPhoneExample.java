package javaBasic4.ch07.sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		p.bell();
		p.sendVoice("ㅇㅇ");
		p.receiveVoice("ㅇㅋ");
		
		SmartPhone sp = new SmartPhone();
		
		sp.sendVoice("ㅎㅇ");
		sp.receiveVoice("ㅂㅇ");
		sp.hangUp();
		
		SmartPhone sp2 = new SmartPhone("아이폰","흰색");
		
		System.out.println(sp2.model); 
		sp2.setWifi(true);
		
		System.out.println(sp2.model+"는 와이파이가 안됩니다.");
		
		System.out.print(sp2.model+"은 "+sp2.color+"이고 ");
		p.bell();
		
		System.out.print(sp2.model+"의 메세지가 왔습니다.\n");
		sp2.sendVoice("핸드폰 샀어?");
		
		
		
		
		
		
	}

}
