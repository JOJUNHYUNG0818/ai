package javaBasic6.ch09.sec07;

public class HomeExample {

	public static void main(String[] args) {
		Home home = new Home();
		
		home.use();
		
		home.use2();
		
		home.use3(new Remotecontrol() {
			
			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������ ���ϴ�.");
				
			}
		});

	}

}
