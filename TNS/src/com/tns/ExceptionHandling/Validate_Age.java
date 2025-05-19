package com.tns.ExceptionHandling;

public class Validate_Age {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int age=5;
		if(age<0)
			throw new Exception("enterd invalid age");
		else
			System.out.println("valid");

	}

}
