package javaBasic5.ch08.sec02;

public class SmartPhone implements RemoteControl{

	private int volume;

	
	@Override
	public void setVolume(int volum) {
		if(volume> RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volum<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volum;
		}
		System.out.println("현재 볼륨: "+this.volume);
	}
	
	@Override
	public void turnOff() {
		System.out.println("핸들폰을 끕니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("핸드폰을 켭니다.");
	}

}
