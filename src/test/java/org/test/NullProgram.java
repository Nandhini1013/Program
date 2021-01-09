package org.test;

public class NullProgram {

	String s=null;
	
	public void Emp() {
    System.out.println(s);
	}
	
	public static void main(String[] args) {
		NullProgram n=new NullProgram();
		n.Emp();
	}
}
