package javaBasic3.ch06.sec2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 대출현황표_메인 {

	public static void main(String[] args) {

		Date now = new Date();
		String nowTime = now.toString();
		System.out.println(nowTime);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		대출현황표 st1 = new 대출현황표("J02-38","이민주", new Date(), "주택자금대출", 2700000, 48);
		대출현황표 st2 = new 대출현황표("Y04-15","진영태", new Date(), "예부적금담보대출", 3000000, 36);
		대출현황표 st3 = new 대출현황표("M02-06","최철식", new Date(), "무보증신용대출", 2000000, 36);
		대출현황표 st4 = new 대출현황표("K03-05","민승렬", new Date(), "국민주택기금댗ㄹ", 1500000, 48);
		
		대출현황표[] dArr =  { 
				new 대출현황표("J02-38","이민주", new Date(), "주택자금대출", 2700000, 48),
				new 대출현황표("Y04-15","진영태", new Date(), "예부적금담보대출", 3000000, 36),
				new 대출현황표("M02-06","최철식", new Date(), "무보증신용대출", 2000000, 36),
				new 대출현황표("K03-05","민승렬", new Date(), "국민주택기금댗ㄹ", 1500000, 60)
				};
		
		for(int i=0; i<dArr.length; i++)
		{
			System.out.println(dArr[i].get기간());
		}
	
		//대출 금액 총합
		int sum =0;
		for(int i=0; i<dArr.length; i++)
		{
			sum+=dArr[i].대출금액;
		}
		System.out.println(sum);
		
		//기간의 평균
		float aver= 0;
		int averSum=0;
		for(int i=0; i<dArr.length; i++)
		{
			averSum+=dArr[i].get기간();
		}
		aver = averSum/dArr.length;
		System.out.println(aver);


		
	}

}
