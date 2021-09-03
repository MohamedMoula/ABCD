package org.task1;

public class Const2 extends Cons1{

	public Const2() {
		this("xyz");
	System.out.println("1st default constructor");
	}

	public Const2(String string) {
		this(123);
		System.out.println("Parameter 2 is "+string);

}

	public Const2(int i) {
System.out.println("parameter2 "+i);
	}

	
}
