package javaApp1.ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeZoneCompareEx {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1,1,0,0);
		LocalDateTime stopDateTime = LocalDateTime.of(2021, 12,31,0,0);
		
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		
		
		System.out.println("���ۿ���: "+startDateTime.format(dtf));
		System.out.println("��������: "+stopDateTime.format(dtf));
		if(startDateTime.isBefore(stopDateTime)) {
			System.out.println("�̺�Ʈ �������Դϴ�.");
		}else if (startDateTime.isEqual(stopDateTime)) {
			System.out.println("�̺�Ʈ �����մϴ�.");
		}else {
			System.out.println("�̺�Ʈ �����߽��ϴ�. ������ȸ��");
		}
		System.out.println();
		
		LocalDateTime startSaleTime = LocalDateTime.of(2023, 12,20,12,0);
		LocalDateTime stopSaleTime = LocalDateTime.of(2023, 12,25,11,59);
		
		System.out.println("�̺�Ʈ ������: "+startSaleTime.format(dtf));
		System.out.println("�̺�Ʈ ������: "+stopSaleTime.format(dtf));
		
		if(startSaleTime.isBefore(stopSaleTime)) {
			System.out.println("�̺�Ʈ �Ⱓ ���� 70%");
		}else if (startSaleTime.isEqual(stopSaleTime)) {
			System.out.println("�̺�Ʈ ������ ���� 85%");
		}else {
			System.out.println("�̺�Ʈ ����");
		}
	}

}
