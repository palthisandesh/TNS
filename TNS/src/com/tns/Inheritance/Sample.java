package com.tns.Inheritance;

class Demo{
	void add() {
		System.out.println("add message");
	}
}

class Sample extends Demo {
	public static void main(String[] args) {
		Sample s=new Sample();
		s.add();
	}

}
