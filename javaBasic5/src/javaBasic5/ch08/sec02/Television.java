package javaBasic5.ch08.sec02;

public class Television implements RemoteControl{
	
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
		System.out.println("ÇöÀç º¼·ý: "+this.volume);
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("Æ¼ºñ¸¦ ²ü´Ï´Ù.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("Æ¼ºñ¸¦ ÄÕ´Ï´Ù.");
	}

}
