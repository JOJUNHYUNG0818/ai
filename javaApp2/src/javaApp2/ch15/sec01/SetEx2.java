package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		// String ��ü set �ֱ�
		Set<String> strSet = new HashSet<String>(); // ctrl + shift + o = import �ڵ����� ��Ű��
		strSet.add("���");
		strSet.add("�ٳ���");
		strSet.add("��");
		strSet.add("��");
		strSet.add("���");
		
		System.out.println(strSet);
		
		// ��� ���ϱ�
		System.out.println(strSet.size());
		Iterator<String> iter = strSet.iterator();
		
		for(int i=0; i<strSet.size(); i++) {
			System.out.println(iter.next());
		}
		System.out.println("�޷��Ⱦƿ�?");
		
		System.out.println(strSet.contains("�޷�"));
		
		strSet.clear();
		System.out.println(strSet.size());
		
		

	}

}
