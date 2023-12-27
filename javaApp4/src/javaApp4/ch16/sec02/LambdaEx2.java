package javaApp4.ch16.sec02;

public class LambdaEx2 {

	public static void main(String[] args) {
		// �͸� Ŭ����
		A a = new A() {
			
			@Override
			public int aM(int a, double b) {
				
				return (int)(a+b);
			}
		};
		
		
		System.out.println(a.aM(10, 5.5));
		
		//���ٽ�
		A a1 = (i,j)->{	return (int)(i+j);	};
		System.out.println(a1.aM(10, 20));
		
		B b1 = (x,y,z)->{
			System.out.println("�̸��� "+x);
			System.out.println("Ű�� "+y);
			System.out.println("���� "+z);
		};
		
		b1.bM("ȫ�浿", 170, true);

	}

}
//@~~ ������̼� �ٷ� �Ʒ��� �ִ� ��ü�� ������ ������ �� �����.
// @FuntionalInterface �������̽��ȿ� �߻�޼ҵ尡 1���� �ִ� ��� ����
@FunctionalInterface
interface A {
	int aM(int a ,double b);
}

@FunctionalInterface

interface B{
	void bM(String x, Integer y , Boolean z);
	
}