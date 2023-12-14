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
		System.out.println("���� ����: "+this.volume);
	}
	
	@Override
	public void turnOff() {
		System.out.println("�ڵ����� ���ϴ�.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("�ڵ����� �մϴ�.");
	}

}
