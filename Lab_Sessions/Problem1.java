package javaPrograms;

import java.util.*;

public class Problem1 {
	ArrayList<Integer> list=new ArrayList<>();
	
	public ArrayList<Integer> storeEvenNumbers(int n){
		list=new ArrayList<Integer>();
		for(int i=2; i<=n; i++) {
			if(i%2==0) {
				list.add(i);
			}
		}
		return list;
		
	}
	public ArrayList<Integer>  printEvenNumbers(){
		ArrayList<Integer> list1=new ArrayList<>();
		System.out.println("Print even numbers with multiplay by 2: ");
		for(int i:list) {
			list1.add(i*2);
			System.out.println(i*2);
			
		}
		return list1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		
		Problem1 p1=new Problem1();
		System.out.println("Even Numbers: ");
		al.addAll(p1.storeEvenNumbers(15));
		for(int i:al) {
			System.out.println(i);
		}
		p1.printEvenNumbers();

	}

}
