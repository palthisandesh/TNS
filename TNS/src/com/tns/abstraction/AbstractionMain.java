package com.tns.abstraction;

public class AbstractionMain extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new AbstractionMain();
		b.deposite();
		b.withdraw();

	}

	@Override
	void deposite() {
		// TODO Auto-generated method stub
		System.out.println("deposite");
		
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw");
		
	}

}
