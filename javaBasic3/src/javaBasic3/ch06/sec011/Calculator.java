package javaBasic3.ch06.sec011;

public class Calculator {
	
	//�޼ҵ� = ���� 
	//���� [����������]   ����ŸĨ �޼ҵ��([�Ű�����])
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff()
	{
		System.out.println("������ ���ϴ�.");
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
