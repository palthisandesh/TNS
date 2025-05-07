package com.tns.Abstraction;

public class Bank extends BankImp{
	
	public static void main(String[] args) {
		Bank b=new Bank();
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
