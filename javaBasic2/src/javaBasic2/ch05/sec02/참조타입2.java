package javaBasic2.ch05.sec02;

public class 참조타입2 {

	public static void main(String[] args) {
		A aAddr = new A();
		
		aAddr.name="홍길동";
		aAddr.kor=80;
		aAddr.aver=3.5f;
		
		A aAddr1 = new A();
		
		System.out.println(aAddr==aAddr1); // false 
		
		A aAddr2 = aAddr1;
		
		System.out.println(aAddr2==aAddr1); // true
		
		int[] array = {1,2,3,4,5};
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		
		
				
	}
}
