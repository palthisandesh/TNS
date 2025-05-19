package com.tns.collection;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> l=new PriorityQueue<String>();
		l.add("sandesh");
		l.add("shiva");
		l.add("killa");
		System.out.println(l);
		
		PriorityQueue<Integer> la=new PriorityQueue<Integer>();
		la.add(30);
		la.add(20);
		la.add(0);
		System.out.println(la);
	}

}
