package com.tns.ExceptionHandling;

public class TryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=8;
			int b=0;
			int result=a/b;
			System.out.println(result);
			int[] arr= {2,4,5,6};
			System.out.println(arr[7]);
		}
		catch(Exception e) {
			System.err.println("error");
		}

	}

}
