package javaBasic7.ch11.sec02.ex01;

public class ExceptionEx {
	
	public static void printlength(String data) {
			int result = data.length();
			System.out.println("���� ��: "+ result);
		
	}
	public static void main(String[] args) {

		try {
			//���� �߻��� �� ���� �ڵ� ���� ���Ѵ�.
		
			int a=10;
			a=a/5;
			System.out.println(a);
			int[] iArr = {10,20,30};
			System.out.println(iArr[4]);
			printlength("THIS IS JAVA");
			printlength(null);
			
			Class.forName("java.lang.String");
			
			
		} catch (ArithmeticException e) {
			System.out.println("�и� 0 �̸� �ȵȴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε��� ������ ������ϴ�.");
		} catch(NullPointerException e){
			e.printStackTrace(); //������ �i�ư��� ������ִ� ��
			System.out.println("null�� �����ؼ� ������ �����ϴ�.");
		}	catch (ClassNotFoundException e) {
			System.out.println("Ŭ�������� Ʋ�Ƚ��ϴ�.");
		} catch (Exception e) {
			System.out.println("��� ������ �θ�Ŭ����");
		} finally {
			//���� ������� �� �ؾ��ϴ� ��
			System.out.println("DB�ݱ�");
			System.out.println("�α׿����ϱ�");
		
		
	}

}
}

