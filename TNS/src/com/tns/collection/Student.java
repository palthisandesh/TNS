package com.tns.collection;

public class Student {
	private int sid;
	private String name;
	private String branch;
	Student(int sid,String name,String branch){
		//super();
		this.sid=sid;
		this.name=name;
		this.branch=branch;
		
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", branch=" + branch + "]";
	}
	
	

	
}
