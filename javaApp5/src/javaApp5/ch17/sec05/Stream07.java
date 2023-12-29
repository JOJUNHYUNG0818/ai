package javaApp5.ch17.sec05;

import java.util.Arrays;

public class Stream07 {

	public static void main(String[] args) {
		// ���� : �ݺ��ؼ� �Ѱ��� �����ͼ� ó���ϱ�
		// ��Ī : ���ǿ� �����ϴ��� ���θ� �����ϴ� ����ó����� 
		int[] intArr= {2,4,6};
		
		boolean result = Arrays.stream(intArr).allMatch(i->i%2==0);
		System.out.println("��� 2�� ����ΰ�? "+result);
		
		
		boolean result1 = Arrays.stream(intArr).anyMatch(i->i%3==0);
		System.out.println("�Ѱ��� 3�� ����ΰ�? "+result1);
		
		boolean result2 = Arrays.stream(intArr).noneMatch(i->i%5==0);
		System.out.println("5�� ����� ���°�? "+result2);
		
		
		int[] intArr2 = {1,2,3,4,5};
		
		long count =  Arrays.stream(intArr2).filter(n->n%2 ==0).count();
		System.out.println("¦���� ����? "+count);
		
		int oddSum = Arrays.stream(intArr2).filter(n->n%2!=0).sum();
		
		System.out.println("Ȧ���� ����? "+oddSum);
		
		
	}

}
