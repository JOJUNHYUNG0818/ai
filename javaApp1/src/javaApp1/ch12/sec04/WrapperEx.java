package javaApp1.ch12.sec04;

public class WrapperEx {

	public static void main(String[] args) {
		
		// �ڷ��� �⺻��: byte char int long boolean float double
		
		//  ""  ������: String Ŭ������ ���� 

		// �⺻���� Ŭ������ �ƴϹǷ� �̸� ������� �޼ҵ尡 ����. �׷��� �⺻�� �ڷ����� Ŭ������ ����� �а� �ִ�. (����Ŭ����)
		
		// �ڽ�= �⺻��--> ��ü, ��ڽ� ��ü-->�⺻��

		Integer a = 10; // ������ ����
		// = Integer a = new Integer(10);
		String strA =a.toString(); // ���� 10�� ���� "10"���� �ٲ�
		double da = a.floatValue();
		System.out.println(da);
		System.out.println(a.MAX_VALUE);
		System.out.println(a.MIN_VALUE);
		System.out.println(a.SIZE);
		
		Double b = 3.14;
	    System.out.println(b.MAX_VALUE);
	    System.out.println(b.SIZE);
		

	}

}
