package javaBasic2.ch05.sec03;

public class 배열연습 {

	public static void main(String[] args) {
		// 배열 : 동일한 자료들의 집합, 연속해서 저장되어 있다.
		// 배열 쓰는 이유? 정수 100개를 기억해야 한다면 변수 100개 만들어야함 
		// 배열 만드는 방법? 1차원 2차원 3차원
		
		/*int[] iArray = new int[] {1,2,3,4,5};
		String[] strArray = new String[] {"a","b"};
		double[] douArray = new double[] {3.3, 2.2, 1.1};
		
		System.out.println(iArray[0]);
		System.out.println(douArray[0]);
		
		String str = "안녕하세요";
		System.out.println(str.charAt(0));

		int[] iArray1 = new int[5];
		
		String[] strArray1 = new String[4];
		
		 strArray1[0] ="a";
		 strArray1[1] ="b";
		 
		 
		 int[] iarray = new int[100];
		 System.out.println(iarray.length);
		 
		 for(int i=1; i<100; i++)
		 {
			 System.out.println(iarray[i]=i);
			
		 }*/
		 
		exArray3();
		
	}
	
	public static void exArray()
	{
		String[] season = {"Spring","Summer","Fall","Winter"};
		
		System.out.println("season[0]"+season[0]);
		System.out.println("season[0]"+season[1]);
		System.out.println("season[0]"+season[2]);
		System.out.println("season[0]"+season[3]);
		
		season[1]="여름";
		System.out.println("season[1]"+season[1]);
		
		int[] score = {90,85,75,65};
		int sum =0;
		for(int i = 0; i<score.length;i++)
		{
			sum+=score[i];
		}
			System.out.println(sum);
			
	}
	
	public static void exArray2() {
		String[] name = { "산타페", "코란다" };
		int[] sumPay = { 3500000, 24000000 };
		int[] pay1 = { 15000000, 5000000 };
		int[] pay2 = { 20000000, 19000000 };
		int[] monthly = { 36, 24 };
	}
	
	
	public static void exArray3()
	{
		String[] 사번 = {"J0001","J0003","J0008","j0009"};
		String[] 이름 = {"홍길동","이도현","한미우","박정진"};
		String[] 부서 = {"총모부","영업부","인사부","영업부"};
		boolean[] 성별 = {true,true,true,true};
		
		for(int i=0; i<4; i++)
		{
			if(부서[i]=="총모부")
			{
				System.out.println(이름[i]);
			}
		}
		
		
		
	}
}
