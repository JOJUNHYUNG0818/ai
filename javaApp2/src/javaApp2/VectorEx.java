package javaApp2;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// ������ �������� cpu�� ����ϸ鼭 ��Ƽ���α׷����ϴ� ��
		// Vector �÷����� �������� �ڷḦ ������� ����
		// �̿�о� : �����带 ��Ƽ���α׷����� �� ������ �ְ� �ߺ������� �� �ִ� �ڷᱸ��

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
