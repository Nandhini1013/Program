package org.test;

public class NullProgram {

	String s="value";
	
	public void Emp() {
    System.out.println(s);
	}
	
	private void Comp() {
System.out.println("company");

	}
	
	public static void main(String[] args) {
		NullProgram n=new NullProgram();
		n.Emp();
	}
}
