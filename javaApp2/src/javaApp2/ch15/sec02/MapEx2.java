package javaApp2.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;



public class MapEx2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "홍길동1");
		hm.put(2, "홍길동2");
		hm.put(3, "홍길동3");
		hm.put(4, "홍길동4");
		
		// 몇개 있나요?
		System.out.println(hm.size());
		
		// key값 3이 있나요?
		System.out.println(hm.containsKey(3));
		
		// key값 3은 무엇이있나요?
		System.out.println(hm.get(3));
		
		// key값 홍길동3이 있나요?
		System.out.println(hm.containsValue("홍길동3"));
		
		// 3 번제거
		hm.remove(3);
		
		System.out.println(hm);
		
		// 전체 출력하기
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> iter =keys.iterator();
		while (iter.hasNext()) {
			System.out.println(hm.get(iter.next()));
		}
		
		
		Set<Entry<Integer, String>> e = hm.entrySet();
		Iterator<Entry<Integer, String>> iter1 = e.iterator();
		while (iter1.hasNext()) {
			//System.out.println(iter1.next()); // key값과 같이 나오게함
			Entry<Integer, String> e1=iter1.next(); // key의 값을 출력
			Integer keyE1 =e1.getKey(); // 키를얻는다
			
			System.out.println(hm.get(keyE1)+"~");
			System.out.println(e1.getValue()+"~~");
			
		}
		
		
		
	}

}
