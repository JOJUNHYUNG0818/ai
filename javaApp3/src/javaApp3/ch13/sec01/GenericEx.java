package javaApp3.ch13.sec01;

public class GenericEx {

	public static void main(String[] args) {
		// ���׸��̶�? ���߿� ���� ���ϴ� ��
		Box<Integer> intBox = new Box<Integer>();
		intBox.content = 100;
		
		Box<String> strBox = new Box<String>();
		strBox.content = "ȫ�浿";
		
		BoxChild<Integer,String> boxChild = new BoxChild<Integer,String>();
		
		boxChild.content=10;
		boxChild.kind="aaa";
		InterImpl<Boolean> iti2 = new InterImpl<Boolean>();
		
		// <T extends Number> ---> Number ��ü�� �ڽĸ� T�� �� �� �ִ�.
		// <? extends Student> ---> Student ��ü�� �ڽĸ� ������
		// <? super Student> ---> student ��ü�� �θ� ������
		// <?><T>---> �����̵� ����
		
	} 

}

class Box<T>{
	T content; // ������ ���� ���� ����, ���ڿ� ,��ü ...
	
}

class BoxChild<T,K> extends Box<T>{
	K kind;
}

interface Inter<A>{
	A method1();
}

class InterImpl<A> implements Inter<A>{

	@Override
	public A method1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}