package com.tns.polymorphism;

class Sample{
	void add() {
		System.out.println("two number");
	}
}
class Demo extends Sample{
	void add3() {
		System.out.println("three");
	}
}

public class MethodOverriding {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.add();
		d.add3();

	}

}
