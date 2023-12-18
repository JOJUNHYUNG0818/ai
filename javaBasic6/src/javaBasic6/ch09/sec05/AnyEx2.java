package javaBasic6.ch09.sec05;

public class AnyEx2 {

	public static void main(String[] args) {
		CImpl ci = new CImpl();
		ci.cM();
		
		C ci2 = new CImpl();
		ci2.cM();
		
		
		C ci3 = new C() { //�������̽��� new �� �� ������. ������ �͸�Ŭ���� ������ ���� 
			@Override
			public void cM() {
				System.out.println("�͸���Ŭ������ �޼ҵ�");
				
			}
		}; // new ��ü() {���� @override} ; = �͸�ü ���� 
		
		ci3.cM();

	}

}


interface C{
	abstract void cM(); // �߻� �޼ҵ�
}

class CImpl implements C{
	@Override
	public void cM() {
		System.out.println("����Ŭ���� (�ڽ�) �޼ҵ�");
		
	}
	
	
}