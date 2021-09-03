package org.task1;

public class Cons1 extends Class3 {
public Cons1() {
	this("abcd");
System.out.println("1st default constructor");
}

public Cons1(String string) {
	this(123);
System.out.println("Parameter is "+string);

}

public Cons1(int i) {
System.out.println("parameter is" +i);
}

	
	
}
