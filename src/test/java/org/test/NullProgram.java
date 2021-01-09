package org.test;

import java.awt.image.SampleModel;

import org.omg.CORBA.PRIVATE_MEMBER;

public class NullProgram {

	String s="data";
	
	public void Emp() {
    System.out.println(s);
	}
	private void data() {
System.out.println("data");
	}
	
	public static void main(String[] args) {
		NullProgram n=new NullProgram();
		n.Emp();
		System.out.println("Employee");
		
		
	
	}
}
