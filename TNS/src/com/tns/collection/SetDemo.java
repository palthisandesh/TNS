package com.tns.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(10);
		s.add(10);
		s.add(30);
		s.add(20);
		System.out.println(s);

	}

}
