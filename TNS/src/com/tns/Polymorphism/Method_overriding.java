package com.tns.Polymorphism;

class Demo {

	static void add(){
		System.out.println("heelo");
	}

}
class Sample extends Demo{
	 static void add() {
		System.out.println("message");
	}
}
class Method_overriding{
	public static void main(String[] args) {
		Sample s=new Sample();
		s.add();
	}
}
