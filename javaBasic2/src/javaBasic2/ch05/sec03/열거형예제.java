package javaBasic2.ch05.sec03;
import java.util.Scanner;
import java.util.Calendar;

public class 열거형예제 {

	public static void main(String[] args) {
	
			//ex8();
			ex9();
	}

	public static void ex6() {

		Week today = null;

		Calendar cal = Calendar.getInstance(); // 날짜를 이용할 수 있다.
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);

		System.out.println(Week.THURSDAY);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUSEDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println(today);
	}
	
	public static void ex7()
	{
		int[] array = {1,2,5,3,8,2 };
		int max = 0;
		for(int i=0; i<array.length; i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
			
		}
		System.out.println(max);
	}

	public static void ex8()
	{
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}};
		int sum=0;
		int arraySum=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0; j<array[i].length;j++)
			{
				sum+=array[i][j];
				arraySum++;
			}
		}
		System.out.println(sum/arraySum);
	}
	
	public static void ex9()
	{
		Scanner sc = new Scanner(System.in);
		int students =0;
		boolean run = true;
		int[] score = null;
		
		while(run)
		{
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("----------------------------------------------");
			int meun = sc.nextInt();
			int max = 0;
			int sum = 0;
			
			if(meun==1)
			{
				System.out.println("학생수> ");
				students = sc.nextInt();
				score = new int[students];
			}
			else if(meun==2)
			{
				for(int i=0; i<students; i++)
				{
					System.out.println("점수입력> ");
					score[i]=sc.nextInt();
				}
			}
			else if(meun==3)
			{
				for(int i=0; i<students; i++)
				{
					System.out.println("Score["+i+"]:"+score[i]);
				}
			}
			else if(meun==4)
			{
				for(int i=0; i<students;i++)
				{
					if(max<score[i])
					{
						max=score[i];
					}
					sum +=score[i];
				}
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+(float)sum/students);
			}
			else if(meun==5)
			{
				System.out.println("프로그램 종료");
				run = false;
				
			}
			
		}
		
	}
 
}
