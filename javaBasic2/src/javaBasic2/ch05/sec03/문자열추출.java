package javaBasic2.ch05.sec03;
import java.util.Scanner;

public class 문자열추출 {

	public static void main(String[] args) {
		ex3();

		
	}
	
	public static void ex()
	{
		String title = "자바프로그래밍";
		String title2 = new String("자바프로그래밍");
		System.out.println(title.length());
		System.out.println(title.charAt(1));
		System.out.println(title.charAt(6));
		System.out.println(title.replace("자바", "JAVA"));
		System.out.println(title.substring(2, 6));
		System.out.println(title.substring(0, 4));
		System.out.println(title.indexOf("밍"));
		System.out.println(title.indexOf("래",0));
	}
	
	public static void ex1()
	{
		String names  = "홍길동,이순신,최민영";
		String[] nameArr = names.split(",");
		
		for(int i=0; i<nameArr.length; i++)
		{
			System.out.println(nameArr[i]);
			
		}
	}
	
	public static void ex2()
	{

		String fruits = "사과-배-귤-바나나";
		String[] fruitsArr = fruits.split("-");
		
		for(int i=0; i<fruitsArr.length; i++)
		{
			System.out.println(fruitsArr[i]);
		}
		
		for(String f : fruitsArr)
		{
			System.out.println(f);
		}
	}

	public static void ex3()
	{
		String fruits = "사과-배-귤-바나나";
		String[] fruitsArr = fruits.split("-");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("무슨 과일 사실래요?");
		
		String order = sc.nextLine();
		boolean flag = false;
		for(String f : fruitsArr)
		{
			if(order.equals(f))
			{
				System.out.println("있습니다.");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("없습니다");
		}
	}
	
	
}
