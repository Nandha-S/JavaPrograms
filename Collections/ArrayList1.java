package javaPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(56);
		list.add(34);
		list.add(54);
		System.out.println(list);//printing array list object
		//Traversing list through Iterator  
		Iterator<Integer> it=list.iterator();//getting the Iterator  
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list.size());
		//sorting....
		System.out.println("Sorting....");
		Collections.sort(list);
		for(int i:list) {
			System.out.println(i);
		}
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(89);
		list1.add(45);
		
		list.addAll(list1);
		System.out.println(list);
		
		list.set(1, 1000);
		list.forEach(n -> System.out.println(n));
		
		
	}
}
