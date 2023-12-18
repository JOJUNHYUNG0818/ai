package javaBasic6.ch09.sec07;

public class Home {
	private Remotecontrol rc = new Remotecontrol() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
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
			System.out.println("에어컨을 끕니다.");
			
		}
		
		@Override
			public void turnOn() {
			System.out.println("에어컨을 켭니다.");
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
