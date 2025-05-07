package com.tns.Polymorphism;



public class Constructor_overloading {
	int a;
	int b;
	int c;
	Constructor_overloading(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	Constructor_overloading(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_overloading a=new Constructor_overloading(4,5);
		Constructor_overloading b=new Constructor_overloading(4,3,5);

	}


}
