package com.tns.Assignement.constructor;

public class BankImplement {
	int accno;
	double amount;
	double balance=5000;
	BankImplement(int accno,double amount){
		this.accno=accno;
		this.amount=amount;
	}
	void deposit() {
		if(balance<amount || amount<0) {
			System.out.println("insufficent balance or amount is less than zero");
		}
		else {
			System.out.println("amount successfully deposit");
			balance+=amount;
			System.out.println("balance"+balance);
		}
	}
	void withdraw() {
		if(balance<amount || amount<0) {
			System.out.println("insufficent balance");
		}
		else {
			System.out.println("amount successfully deposit");
			balance-=amount;
			System.out.println("balance"+balance);
		}
	}

}
