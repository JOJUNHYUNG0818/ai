package javaBasic6.ch09.sec03;

public class LocalExample {

	public static void main(String[] args) {
		
		LocalExample le = new LocalExample();
		le.localM();

	}
	
	
	public void localM() {
		int a= 10;
		
		class AAA{
			int sa =100;
			void m() {
				System.out.println("�޼ҵ�ȿ� �ִ� Ŭ������ �޼ҵ�");
			}
		}
		
		AAA aaa = new AAA(); // ��ü����
		aaa.m();// ����ϱ�
	}

}