package javaBasic3.ch06.sec011;

public class Calculator {
	
	//메소드 = 동작 
	//형식 [접근제한자]   리턴타칩 메소드명([매개변수])
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff()
	{
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y)
	{
		int result = x + y;
		return result;
	}
	
	int plus(int x, int y, int z)
	{
		int result = x + y + z;
		return result;
	}
	
	
}
