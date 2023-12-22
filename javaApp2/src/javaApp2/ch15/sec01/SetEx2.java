package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		// String 객체 set 넣기
		Set<String> strSet = new HashSet<String>(); // ctrl + shift + o = import 자동으로 시키기
		strSet.add("사과");
		strSet.add("바나나");
		strSet.add("배");
		strSet.add("귤");
		strSet.add("사과");
		
		System.out.println(strSet);
		
		// 요소 구하기
		System.out.println(strSet.size());
		Iterator<String> iter = strSet.iterator();
		
		for(int i=0; i<strSet.size(); i++) {
			System.out.println(iter.next());
		}
		System.out.println("메론팔아요?");
		
		System.out.println(strSet.contains("메론"));
		
		strSet.clear();
		System.out.println(strSet.size());
		
		

	}

}
