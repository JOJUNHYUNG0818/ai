package javaApp2.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "�̼���");
		map.put(2, "�ڼ���");
		map.put(3, "ȫ�浿");
		map.put(4, "�ſ��");
		
		Map<String, Double> map1 = new HashMap<String, Double>();
		
		map1.put("A", 4.);
		map1.put("B", 3.);
		map1.put("C", 2.);
		map1.put("D", 1.);
		
		System.out.println(map.get(1));
		System.out.println(map1.get("A"));
		System.out.println(map1.size());
		
		Map<String, String> map2 = new HashMap<String, String>();
		
		map2.put("ȫ�浿","����");
		map2.put("�̼���","����");
		map2.put("�ְ��","���");
		map2.put("ȫ�浿","����");
		
		map2.remove("�ְ��");
		
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
