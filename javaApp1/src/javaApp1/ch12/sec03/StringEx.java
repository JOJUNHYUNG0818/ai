package javaApp1.ch12.sec03;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		String data = "�ڹ�";
		byte[] arr1 = data.getBytes();
		System.out.println(arr1[0]);
		System.out.println(arr1.length); // �ѱ� �ѱ��ڴ� 2����Ʈ ����
		
		String str1 = Arrays.toString(arr1);
		System.out.println(str1);
		
		//StringBuilderŬ����
		data = data +"java";
		System.out.println((data));
		StringBuilder strB = new StringBuilder();
		strB.append("�ڹ�");
		System.out.println(strB);
		strB.append("java");
		System.out.println(strB);
		strB.insert(0, "a");
		System.out.println(strB);
		strB.delete(1, 3);

		
	
	
	
	}

}
