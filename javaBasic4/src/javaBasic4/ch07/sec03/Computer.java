package javaBasic4.ch07.sec03;

public class Computer extends Calculator{
	
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return 2*3.14*r*r;
	}
	

}
