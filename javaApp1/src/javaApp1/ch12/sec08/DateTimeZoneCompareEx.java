package javaApp1.ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeZoneCompareEx {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1,1,0,0);
		LocalDateTime stopDateTime = LocalDateTime.of(2021, 12,31,0,0);
		
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		
		
		System.out.println("시작연도: "+startDateTime.format(dtf));
		System.out.println("마감연도: "+stopDateTime.format(dtf));
		if(startDateTime.isBefore(stopDateTime)) {
			System.out.println("이벤트 진행중입니다.");
		}else if (startDateTime.isEqual(stopDateTime)) {
			System.out.println("이벤트 마감합니다.");
		}else {
			System.out.println("이벤트 마감했습니다. 다음기회에");
		}
		System.out.println();
		
		LocalDateTime startSaleTime = LocalDateTime.of(2023, 12,20,12,0);
		LocalDateTime stopSaleTime = LocalDateTime.of(2023, 12,25,11,59);
		
		System.out.println("이벤트 시작일: "+startSaleTime.format(dtf));
		System.out.println("이벤트 마감일: "+stopSaleTime.format(dtf));
		
		if(startSaleTime.isBefore(stopSaleTime)) {
			System.out.println("이벤트 기간 세일 70%");
		}else if (startSaleTime.isEqual(stopSaleTime)) {
			System.out.println("이벤트 마감일 세일 85%");
		}else {
			System.out.println("이벤트 종료");
		}
	}

}
