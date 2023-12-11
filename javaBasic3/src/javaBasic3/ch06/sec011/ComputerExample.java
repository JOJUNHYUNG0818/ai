package javaBasic3.ch06.sec011;

public class ComputerExample {

	public static void main(String[] args) {

		Computer computer = new Computer();
		
		int result = computer.sum(1,2,3);
		System.out.println(result);
		
		System.out.println(computer.avg(11.5,22.5,33.5,44.5,55.5));
	}

}
