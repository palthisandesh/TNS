package com.tns.ExceptionHandling;

public class Validate_Age {

	public static void main(String[] args)throws MyException {
		// TODO Auto-generated method stub
		int age=20;
		if(age<0)
			throw new MyException("enterd invalid age");
		else
			System.out.println("valid");

	}

}
