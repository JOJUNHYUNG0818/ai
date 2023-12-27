package javaApp4.ch16.sec01;

public class LambdaEx {

	public static void main(String[] args) {
		
		// ��� 1.
		InterImpl inter01 = new InterImpl();
		inter01.a();
		
		// ��� 2. �͸���
		Inter01 inter001 =  new Inter01() {
			
			@Override
			public void a() {
			System.out.println("�͸� �������̽��� ������ �޼ҵ�");	
			}
		};
		
		inter001.a();
		
		// ��� 3. ���ٽ� ����) �������̽��ȿ� �߻�޼ҵ尡 1���ۿ� ���� ��츸 ����
		Inter01 lamda001 = ()->{
			System.out.println("���ٽ����� ������ �޼ҵ�");
		};
		
		lamda001.a();
	}

}


interface Inter01{
	void a();
}
interface Inter02{
	void b();
}

class InterImpl implements Inter01{
	@Override
	public void a() {
		System.out.println("�������̽��� ������ �޼ҵ�");
		
	}
}

