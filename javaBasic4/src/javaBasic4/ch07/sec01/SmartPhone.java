package javaBasic4.ch07.sec01;

public class SmartPhone extends Phone{
	
	public boolean wifi;

	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public SmartPhone() {
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		if(wifi==true)
		{
			System.out.println("�������̰� �˴ϴ�.");
		}
		else
		{
			System.out.println("�������̰� �ȵ˴ϴ�.");
		}
	}
	
	public void internet() {
		System.out.println("���ͳ��� �����մϴ�.");
	}
}
