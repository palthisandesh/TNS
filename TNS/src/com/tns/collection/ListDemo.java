package com.tns.collection;

import java.util.ArrayList;
import java.util.List;

//list interface
public class ListDemo {
	public static void main(String[] args) {
		//
		List l=new ArrayList();
		l.add("sandesh");
		l.add(23.4);
		l.add(true);
		System.out.println(l);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(33);
		l2.add(23);
		System.out.println(l2);
		
	}

}
