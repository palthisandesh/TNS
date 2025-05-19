package com.tns.Interface;

interface Noraml{
	void deposit(double amount);
	void withdraw(double amount);
}
class Bank implements Noraml{
	private double balance=5000;

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>=0 && amount<=balance) {
			balance+=amount;
			System.out.println("deposit"+ balance);
		}
		else{
			System.out.println("insufficent");
		}
		
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>=0 && amount<=balance) {
			balance-=amount;
			System.out.println("withdraw"+ balance);
		}
		else{
			System.out.println("insufficent");
		}
		
	}

}
public class NoramlnterfaceMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.deposit(1000);
		b.withdraw(1000);
		

	}
}