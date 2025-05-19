package com.tns.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> l= new ArrayList<Student>();
		l.add(new Student(101,"sandesh","cse") );
		l.add(new Student(102,"abbu","cse") );
		l.add(new Student(103,"kavya","cse") );
		
		for(Student i:l)
			System.out.println(i);
		
	}

}
