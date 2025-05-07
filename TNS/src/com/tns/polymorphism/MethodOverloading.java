package com.tns.polymorphism;

public class MethodOverloading {
	void add(int a,int b) {
		System.out.println("two number"+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("three number"+(a+b+c));
	}
	public static void main(String[] args) {
		MethodOverloading s=new MethodOverloading();
		s.add(3, 30,3);
		
	}

}

