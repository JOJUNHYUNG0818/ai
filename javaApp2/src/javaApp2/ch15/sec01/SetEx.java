package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(50);
		set.add(80);
		set.add(10); // �ߺ� ���x
		
		System.out.println(set.size());
		Iterator<Integer> iter = set.iterator();// �ݺ�
		
		while (iter.hasNext()) {
			System.out.println(iter.next()); // �������� ���
		}
		System.out.println(set.contains(40));
		System.out.println(set.isEmpty());
		set.remove(50);
		System.out.println(set);
		iter =set.iterator(); // �ٽ� �ҷ����°�
		System.out.println(iter.next());
		System.out.println(iter.next());
		
		set.add(100);
		set.remove(80);
		
		System.out.println(set);
		set.add(90);
		System.out.println(set);
		

	}

}
