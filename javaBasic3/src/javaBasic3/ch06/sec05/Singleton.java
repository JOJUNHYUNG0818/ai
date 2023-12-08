package javaBasic3.ch06.sec05;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	public static Singleton getInstance()
	{
		return singleton;
	}
	
	
}
	