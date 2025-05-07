package com.tns.polymorphism;

public class ConstructorOverriding {
	ConstructorOverriding(int a,int b){
		System.out.println(a+b);
	}
	ConstructorOverriding(int a,int b,int c){
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverriding s=new ConstructorOverriding(5, 4, 4);
		ConstructorOverriding s3=new ConstructorOverriding(5, 4);
		

	}

}
