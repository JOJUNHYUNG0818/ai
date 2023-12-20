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
		System.out.println(cal.get(Calendar.MONTH)+"�� "+cal.get(Calendar.DAY_OF_MONTH)+"��");
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("����ð� : "+now.format(dtf));
		LocalDateTime afterNow = now.plusYears(1);
		System.out.println("1���� : "+afterNow.format(dtf));
		LocalDateTime beforeNow =  now.minusYears(3);
		System.out.println("3���� : "+beforeNow.format(dtf));
		LocalDateTime after2Week = now.plusWeeks(2);
		System.out.println("2���� : "+after2Week.format(dtf));
		
		// ���ΰ� Ÿ���� ���̵� ����
		//String[] av = TimeZone.getAvailableIDs();
		//for(String a : av) {
		//	System.out.println(a);
	}
}

