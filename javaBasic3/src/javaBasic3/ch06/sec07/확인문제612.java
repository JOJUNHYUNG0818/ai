package javaBasic3.ch06.sec07;
import java.util.Scanner;
public class Ȯ�ι���612 {

	public static void main(String[] args) {

		String id;
		String pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է��Ͻÿ�");
		id = sc.next();
		System.out.println("��й�ȣ�� �Է��Ͻÿ�");
		pass = sc.next();
		
		Member user1 = new Member(id,pass);
		boolean result = user1.login(id, pass);
		
		if(result)
		{
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}

		
		
	}

}
