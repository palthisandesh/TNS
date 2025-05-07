package com.tns.Inheritance;



class Demo{
	static void add() {
		System.out.println("hello");
	}
}

class Test extends Demo{
	static void msg() {
		System.out.println("messsage");
	}
}

class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.msg();
		t.add();
		

	}

}

