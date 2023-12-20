package javaApp1.ch12.sec08;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		String strDate = date.toString();
		System.out.println(strDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow =  sdf.format(date);
		System.out.println(strNow);

	}

}
