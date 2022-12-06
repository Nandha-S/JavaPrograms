package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> s=new HashSet<>();//Creating HashSet and adding elements 
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		Iterator<String> l=s.iterator();
		System.out.println("Original.........");
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		s.remove("one");//removing element
		System.out.println("After removing.........");
		System.out.println(s);
		ArrayList<String> list=new ArrayList<String>();//Java HashSet from another Collection
		list.addAll(s);
		for(String i:list) {
			System.out.println(i);
		}

	}

}
