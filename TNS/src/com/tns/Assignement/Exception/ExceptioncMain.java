package com.tns.Assignement.Exception;

import java.util.Scanner;

import com.tns.Assignement.constructor.BankImplement;

public class ExceptioncMain{

	public static void main(String[] args) throws CustomException{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double balance=5000;
		System.out.println("enter your account number");
		int accno=s.nextInt();
		System.out.println("enter amount");
		double amount=s.nextDouble();
		System.out.println("1. deposit  2.withdraw please select one");
		int op=s.nextInt();
		switch(op){
		case 1:
			deposit(balance,amount);
			break;
		case 2:
			withdraw(balance,amount);
			break;
		default:
			System.out.println("invalid option");
		}
		

	}
	static void deposit(double balance,double amount) throws CustomException {
		if(balance<amount) {
			throw new CustomException("insufficent balance");
		}
		else if(amount<0) {
			throw new CustomException("invalid amount");
		}
		else {
			System.out.println("amount successfully deposit");
			balance+=amount;
			System.out.println("balance"+balance);
		}
	}
	static void withdraw(double balance,double amount) throws CustomException {
		if(balance<amount) {
			throw new CustomException("insufficent balance");
		}
		else if(amount<0) {
			throw new CustomException("invalid amount");
		}
		else {
			System.out.println("amount successfully deposit");
			balance-=amount;
			System.out.println("balance"+balance);
		}
	}

}
