package javaBasic3.ch06.sec05;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton s1 =  Singleton.getInstance();
		Singleton s2 =  Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}
