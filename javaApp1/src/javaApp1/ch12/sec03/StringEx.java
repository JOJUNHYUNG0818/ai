package javaApp1.ch12.sec03;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		String data = "자바";
		byte[] arr1 = data.getBytes();
		System.out.println(arr1[0]);
		System.out.println(arr1.length); // 한글 한글자는 2바이트 차지
		
		String str1 = Arrays.toString(arr1);
		System.out.println(str1);
		
		//StringBuilder클래스
		data = data +"java";
		System.out.println((data));
		StringBuilder strB = new StringBuilder();
		strB.append("자바");
		System.out.println(strB);
		strB.append("java");
		System.out.println(strB);
		strB.insert(0, "a");
		System.out.println(strB);
		strB.delete(1, 3);

		
	
	
	
	}

}
