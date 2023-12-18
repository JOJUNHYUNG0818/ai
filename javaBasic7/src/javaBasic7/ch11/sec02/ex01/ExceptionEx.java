package javaBasic7.ch11.sec02.ex01;

public class ExceptionEx {
	
	public static void printlength(String data) {
			int result = data.length();
			System.out.println("문자 수: "+ result);
		
	}
	public static void main(String[] args) {

		try {
			//예외 발생할 것 같은 코드 내용 감싼다.
		
			int a=10;
			a=a/5;
			System.out.println(a);
			int[] iArr = {10,20,30};
			System.out.println(iArr[4]);
			printlength("THIS IS JAVA");
			printlength(null);
			
			Class.forName("java.lang.String");
			
			
		} catch (ArithmeticException e) {
			System.out.println("분모가 0 이면 안된다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위가 벗어났습니다.");
		} catch(NullPointerException e){
			e.printStackTrace(); //에러를 쫒아가서 출력해주는 것
			System.out.println("null로 연결해서 오류가 났습니다.");
		}	catch (ClassNotFoundException e) {
			System.out.println("클래스명이 틀렸습니다.");
		} catch (Exception e) {
			System.out.println("모든 예외의 부모클래스");
		} finally {
			//예외 상관없이 꼭 해야하는 것
			System.out.println("DB닫기");
			System.out.println("로그오프하기");
		
		
	}

}
}

