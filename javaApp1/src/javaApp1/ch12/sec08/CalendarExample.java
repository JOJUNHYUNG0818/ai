package javaApp1.ch12.sec08;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //달력을 사용할수 있는 메소드
		int a1 = cal.get(Calendar.YEAR); //상수명
		System.out.println(a1); //상수값
		int a3 = cal.get(Calendar.MONTH);
		System.out.println(a3+1);
		int a4 = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(a4);
		
	}

}
