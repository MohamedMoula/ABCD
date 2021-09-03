package org.task1;

public class Const3 extends Const2{

	public Const3() {
		this("pqrs@123");
	System.out.println("1st default constructor");
	}

	public Const3(String string) {
		this(004);
		System.out.println("Parameter 2 is "+string);

}

	public Const3(int i) {
System.out.println("parameter2 "+i);
	}

	
	public static void main(String[] args) {
		Const3 c3= new Const3();
		
		c3.apple();
		c3.avacado();
		c3.AxisBank();
		c3.bus();
		c3.car();
		c3.clientId();
		c3.comId();
		c3.demo();
		c3.emId();
		c3.empname();
		c3.IndianBank();
		c3.java();
		c3.Kotak();
		c3.lemon();
		c3.selenium();
		c3.train();
		
	}
	
}
