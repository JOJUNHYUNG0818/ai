package javaBasic4.ch07.sec0708;

import javaBasic4.ch07.sec0706.A;

public class D extends A {

	public D() {
	super();	
	}
	
	public void method() {
		this.field = "value";
		this.method();
	}
}
