package javaPrograms;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<>();
		ll.add("nandha");
		ll.add("kumar");
		ll.add("pravin");
		System.out.println("original "+ll);
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("sathish");
		ll1.add("kumar");
		ll.addAll(ll1);
		System.out.println("after add second list "+ll);
		ll.removeFirstOccurrence("kumar");
		System.out.println("after remove first occurrence kumar "+ll);
		ll.removeAll(ll1);
		System.out.println("after removing all elements in second list "+ll);

	}

}
