package javaBasic3.ch06.sec07;
import java.util.Scanner;
public class 확인문제612 {

	public static void main(String[] args) {

		String id;
		String pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하시오");
		id = sc.next();
		System.out.println("비밀번호를 입력하시오");
		pass = sc.next();
		
		Member user1 = new Member(id,pass);
		boolean result = user1.login(id, pass);
		
		if(result)
		{
			System.out.println("로그인 되었습니다.");
		}
		else
		{
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

		
		
	}

}
