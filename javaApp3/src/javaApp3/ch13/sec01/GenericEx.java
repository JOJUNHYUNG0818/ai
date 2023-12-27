package javaApp3.ch13.sec01;

public class GenericEx {

	public static void main(String[] args) {
		// 제네릭이란? 나중에 형을 정하는 것
		Box<Integer> intBox = new Box<Integer>();
		intBox.content = 100;
		
		Box<String> strBox = new Box<String>();
		strBox.content = "홍길동";
		
		BoxChild<Integer,String> boxChild = new BoxChild<Integer,String>();
		
		boxChild.content=10;
		boxChild.kind="aaa";
		InterImpl<Boolean> iti2 = new InterImpl<Boolean>();
		
		// <T extends Number> ---> Number 객체의 자식만 T가 될 수 있다.
		// <? extends Student> ---> Student 객체의 자식만 가능함
		// <? super Student> ---> student 객체의 부모만 가능함
		// <?><T>---> 무엇이든 가능
		
	} 

}

class Box<T>{
	T content; // 내용을 담을 변수 정수, 문자열 ,객체 ...
	
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