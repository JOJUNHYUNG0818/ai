package javaApp5.ch17.sec05;

import java.util.Arrays;

public class Stream07 {

	public static void main(String[] args) {
		// 루핑 : 반복해서 한개씩 가져와서 처리하기
		// 매칭 : 조건에 만족하는지 여부를 조사하는 최종처리기능 
		int[] intArr= {2,4,6};
		
		boolean result = Arrays.stream(intArr).allMatch(i->i%2==0);
		System.out.println("모두 2의 배수인가? "+result);
		
		
		boolean result1 = Arrays.stream(intArr).anyMatch(i->i%3==0);
		System.out.println("한개라도 3의 배수인가? "+result1);
		
		boolean result2 = Arrays.stream(intArr).noneMatch(i->i%5==0);
		System.out.println("5의 배수는 없는가? "+result2);
		
		
		int[] intArr2 = {1,2,3,4,5};
		
		long count =  Arrays.stream(intArr2).filter(n->n%2 ==0).count();
		System.out.println("짝수의 갯수? "+count);
		
		int oddSum = Arrays.stream(intArr2).filter(n->n%2!=0).sum();
		
		System.out.println("홀수의 합은? "+oddSum);
		
		
	}

}
