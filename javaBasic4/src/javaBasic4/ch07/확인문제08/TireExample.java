package javaBasic4.ch07.Ȯ�ι���08;

public class TireExample {

	public static void main(String[] args) {
		SnowTire snow = new SnowTire();
		Tire tire =  snow;
		
		snow.run();
		tire.run();

		
	}

}
