package javaApp2.ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;



public class MapEx2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "ȫ�浿1");
		hm.put(2, "ȫ�浿2");
		hm.put(3, "ȫ�浿3");
		hm.put(4, "ȫ�浿4");
		
		// � �ֳ���?
		System.out.println(hm.size());
		
		// key�� 3�� �ֳ���?
		System.out.println(hm.containsKey(3));
		
		// key�� 3�� �������ֳ���?
		System.out.println(hm.get(3));
		
		// key�� ȫ�浿3�� �ֳ���?
		System.out.println(hm.containsValue("ȫ�浿3"));
		
		// 3 ������
		hm.remove(3);
		
		System.out.println(hm);
		
		// ��ü ����ϱ�
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> iter =keys.iterator();
		while (iter.hasNext()) {
			System.out.println(hm.get(iter.next()));
		}
		
		
		Set<Entry<Integer, String>> e = hm.entrySet();
		Iterator<Entry<Integer, String>> iter1 = e.iterator();
		while (iter1.hasNext()) {
			//System.out.println(iter1.next()); // key���� ���� ��������
			Entry<Integer, String> e1=iter1.next(); // key�� ���� ���
			Integer keyE1 =e1.getKey(); // Ű����´�
			
			System.out.println(hm.get(keyE1)+"~");
			System.out.println(e1.getValue()+"~~");
			
		}
		
		
		
	}

}
