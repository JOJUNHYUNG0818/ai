package javaApp4.ch16.sec02;

public class LambdaEx3 {
	public static void main(String[] args) {
		
		
		College<String> s1 =  (name) ->name +"���б�";
		System.out.println(s1.cName("����"));
		System.out.println(s1.cName("��õ"));
		
		College<String> s2 = (name) ->name +" �缼��";
		System.out.println(s2.cName("���"));
		System.out.println(s2.cName("��"));
		
		College<Integer> s3 = (name) -> {
		if(name>=3000) {
		System.out.println("��ο�");}
		else
		System.out.println("�ο�");
		return 0; // *�ƹ� �ǹ̾���
		};
		
		s3.cName(4000);
		s3.cName(1000);
		
	}
}


interface College<T>{
	T cName(T name);
}