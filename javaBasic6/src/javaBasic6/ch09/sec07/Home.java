package javaBasic6.ch09.sec07;

public class Home {
	private Remotecontrol rc = new Remotecontrol() {
		
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
			
		}
	};

	
	public void use() {
		rc.turnOn();
		rc.turnOff();
	}
	
	
	public void use2() {
		Remotecontrol rc = new Remotecontrol() {
		@Override
		public void turnOff() {
			System.out.println("�������� ���ϴ�.");
			
		}
		
		@Override
			public void turnOn() {
			System.out.println("�������� �մϴ�.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}

	
	public void use3(Remotecontrol rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}
