package com.tns.Polymorphism;

public class CompileTimeOverLoading {
	static void add(int a,int b) {
		System.out.println("add"+ (a+b));
	}
	static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(4,5);
		add(2,3,4);
		

	}

}
