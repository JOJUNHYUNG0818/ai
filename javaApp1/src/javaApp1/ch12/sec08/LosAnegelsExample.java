package javaApp1.ch12.sec08;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class LosAnegelsExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angels");
		TimeZone ourTime = TimeZone.getTimeZone("Asia/Seoul");
		
		Calendar cal = Calendar.getInstance(timeZone);
		System.out.println(cal.get(Calendar.MONTH)+"월 "+cal.get(Calendar.DAY_OF_MONTH)+"일");
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("현재시간 : "+now.format(dtf));
		LocalDateTime afterNow = now.plusYears(1);
		System.out.println("1년후 : "+afterNow.format(dtf));
		LocalDateTime beforeNow =  now.minusYears(3);
		System.out.println("3년전 : "+beforeNow.format(dtf));
		LocalDateTime after2Week = now.plusWeeks(2);
		System.out.println("2주후 : "+after2Week.format(dtf));
		
		// 전셰계 타임존 아이디값 열기
		//String[] av = TimeZone.getAvailableIDs();
		//for(String a : av) {
		//	System.out.println(a);
	}
}

