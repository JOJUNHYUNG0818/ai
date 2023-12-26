package javaApp2.ch15.sec06;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores.size());
		
		
		Iterator<Integer> iter = scores.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+ " ");
		}
		System.out.println("\n");
		
		for(Integer s : scores) {
			System.out.print(s+" ");
		}
		System.out.println("\n");
		
		//가장 낮은 점수
		System.out.println(scores.first());
		//가장 높은 점수
		System.out.println(scores.last());
		
		//95점보다 낮은 점수
		System.out.println(scores.lower(95));
		
		//85점보다 낮은 점수
		System.out.println(scores.lower(85));
		
		// 95점 이거나 바로 아래 점수
		System.out.println(scores.floor(95));
		
		//95점 이거나 바로 위 점수
		System.out.println(scores.ceiling(96));
		
		NavigableSet<Integer> ds = scores.descendingSet();
		
		for(Integer d : ds) {
			System.out.println(d+"~");
		}
		//80~90
		SortedSet<Integer> s8090 = scores.subSet(80,false, 90,false); // false 넣으면 81~89까지
		for(Integer s : s8090) {
			System.out.println(s+"~~");
		}
		
		// 트리에 노드가 87이 있나요??
		System.out.println(scores.contains(87));
			
			
		
		
	}

}
