package javaBasic2.ch05.sec03;
import java.util.Scanner;

public class ���ڿ����� {

	public static void main(String[] args) {
		ex3();

		
	}
	
	public static void ex()
	{
		String title = "�ڹ����α׷���";
		String title2 = new String("�ڹ����α׷���");
		System.out.println(title.length());
		System.out.println(title.charAt(1));
		System.out.println(title.charAt(6));
		System.out.println(title.replace("�ڹ�", "JAVA"));
		System.out.println(title.substring(2, 6));
		System.out.println(title.substring(0, 4));
		System.out.println(title.indexOf("��"));
		System.out.println(title.indexOf("��",0));
	}
	
	public static void ex1()
	{
		String names  = "ȫ�浿,�̼���,�ֹο�";
		String[] nameArr = names.split(",");
		
		for(int i=0; i<nameArr.length; i++)
		{
			System.out.println(nameArr[i]);
			
		}
	}
	
	public static void ex2()
	{

		String fruits = "���-��-��-�ٳ���";
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
		String fruits = "���-��-��-�ٳ���";
		String[] fruitsArr = fruits.split("-");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ��Ƿ���?");
		
		String order = sc.nextLine();
		boolean flag = false;
		for(String f : fruitsArr)
		{
			if(order.equals(f))
			{
				System.out.println("�ֽ��ϴ�.");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("�����ϴ�");
		}
	}
	
	
}
