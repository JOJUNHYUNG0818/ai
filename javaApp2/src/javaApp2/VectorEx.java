package javaApp2;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 스레드 여러개의 cpu를 사용하면서 멀티프로그래밍하는 것
		// Vector 컬렉션은 스레드의 자료를 담기위한 구조
		// 이용분야 : 스레드를 멀티프로그래밍할 때 순서가 있고 중복저장할 수 있는 자료구조

		Vector<Double> dArr = new Vector<Double>();
		dArr.add(10.3);
		dArr.add(8.8);
		dArr.add(9.4);
		dArr.add(3.7);
		dArr.add(2, 7.9);
		
		System.out.println(dArr.contains(3.7)); 
		
		dArr.remove(10.3);
		
		System.out.println(dArr);
		
	}

}
