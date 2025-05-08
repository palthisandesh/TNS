package com.tns.Assignement.constructor;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter your account number");
		int accno=s.nextInt();
		System.out.println("enter amount");
		double amount=s.nextDouble();
		System.out.println("1. deposit  2.withdraw please select one");
		int op=s.nextInt();
		switch(op){
		case 1:
			BankImplement b=new BankImplement(accno,amount);
			b.deposit();
			break;
		case 2:
			BankImplement b1=new BankImplement(accno,amount);
			b1.withdraw();
			break;
		default:
			System.out.println("invalid option");
		}

	}

}
