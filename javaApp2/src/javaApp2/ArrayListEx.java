package javaApp2;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		int[] arr = {1,2};
		for(int i: arr ) {
			System.out.println(i);
		}
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		System.out.println(arrList.size()); // ArrayList�ȿ� ��� ��Ұ� �ִ��� ��ȯ
		
		arrList.add(3);
		arrList.add(4);
		arrList.add(0, -7);
		System.out.println(arrList);
		for(int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i)+" ");
		}
		System.out.println();
		
		
		ArrayList<String> strList = new ArrayList<String>();
		// ��� �� �� �ٳ���
		strList.add("���");
		strList.add("��");
		strList.add("��");
		strList.add("�ٳ���");
		
		//�ְ� �ٳ��� ���̿� ���ξ��� �ֱ�
		strList.add(3, "���ξ���");
		//��� �� ���̿� �޷� �ֱ�
		strList.add(1,"�޷�");
		System.out.println(strList);
		strList.set(3, "õ����");
		System.out.println(strList);
		strList.remove(5);
		System.out.println(strList);
		
		//���ξ����� �ֽ��ϱ�?
		System.out.println(strList.contains("���ξ���"));
		
		if(strList.contains("���")&&strList.contains("��")) {
			System.out.println("�ֽ��ϴ�");
		}else {
			System.out.println("�����ϴ�");
		}
		
		strList.clear();
		System.out.println(strList); 
		
		
		
		}
	
	

}
