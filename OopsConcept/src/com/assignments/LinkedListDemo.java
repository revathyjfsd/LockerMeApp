package com.assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("RED");
		linkedList.add("BLUE");
		linkedList.add("ORANGE");
		linkedList.add("GREEN");
		Iterator<String> it = linkedList.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("Iterating through all elements in a linked list starting at index 1");
		for(int i=1;i<linkedList.size();i++)
			System.out.println(linkedList.get(i));
		System.out.println("Iterating a linked list in reverse order");
		for(int i=linkedList.size()-1;i>0;i--)
			System.out.println(linkedList.get(i));
		System.out.println("Inserting the specified element 'YELLOW' at the specified position 2 in the linked list");
		linkedList.add(1, "Yellow");
		System.out.println(linkedList);
		System.out.println("Inserting elements into the linked list at the first and last position");
		linkedList.addFirst("PURPLE");
		linkedList.addLast("ROSE");
		System.out.println(linkedList);
		System.out.println("To insert the specified element at the front of a linked list");
		linkedList.offerFirst("PINK");
		System.out.println(linkedList);
		System.out.println("To insert the specified element at the end of a linked list");
		linkedList.offerLast("WHITE");
		System.out.println(linkedList);
		System.out.println("To insert some elements at the specified position 2 into a linked list.");
		LinkedList<String> linkedList1 = new LinkedList<String>();
		linkedList1.add("SILVER");
		linkedList1.add("BLACK");
		linkedList.add("ORANGE");
		linkedList.addAll(1, linkedList1);
		System.out.println(linkedList);
		System.out.println("To get the first and last occurrence of the specified elements in a linked list");
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
	
		
	}

}
