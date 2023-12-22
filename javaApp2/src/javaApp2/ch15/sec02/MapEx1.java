package javaApp2.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "이순신");
		map.put(2, "박수연");
		map.put(3, "홍길동");
		map.put(4, "신용권");
		
		Map<String, Double> map1 = new HashMap<String, Double>();
		
		map1.put("A", 4.);
		map1.put("B", 3.);
		map1.put("C", 2.);
		map1.put("D", 1.);
		
		System.out.println(map.get(1));
		System.out.println(map1.get("A"));
		System.out.println(map1.size());
		
		Map<String, String> map2 = new HashMap<String, String>();
		
		map2.put("홍길동","과장");
		map2.put("이순신","부장");
		map2.put("최경미","사원");
		map2.put("홍길동","사장");
		
		map2.remove("최경미");
		
		System.out.println(map2);
		
		Set<String> map1Keys = map1.keySet();
		
		Iterator<String> iter = map1Keys.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		iter = map1Keys.iterator();
		while(iter.hasNext()) {
			System.out.println(map1.get(iter.next()));
		}
		
	}

}
