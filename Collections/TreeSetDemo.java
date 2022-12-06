package javaPrograms;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(5);
		ts.add(3);
		ts.add(1);
		ts.add(2);
		ts.add(4);
		System.out.println("Original set:"+ts);
		//System.out.println("Reversed set:"+ts.descendingSet());
		System.out.println("highest set:"+ts.pollLast());
		System.out.println("Lowest set:"+ts.pollLast());
		

	}

}
