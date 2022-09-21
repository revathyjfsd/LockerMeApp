package com.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("RED");
		queue.add("BLUE");
		queue.add("ORANGE");
		queue.add("GREEN");
		Iterator<String> it = queue.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("to add all the elements of a priority queue to another priority queue");
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		
		 queue1.add("YELLOW");
		 queue1.add("WHITE");
		 System.out.println(queue);
		 System.out.println(queue1);
		 queue1.addAll(queue);
		 System.out.println("After adding the 2 queues");
		 System.out.println(queue);
		 System.out.println(queue1);
		 System.out.println("Removing all the  element the queue2");
		 queue1.clear();
		 System.out.println(queue1);
		 queue1 = queue;
		 System.out.println("To count the number of elements in a priority queue"+queue.size());
		 System.out.println("to compare two priority queues"+queue.containsAll(queue1));
		 System.out.println("Retriveing the first element "+queue.peek());

		 System.out.println("Removing the first element "+queue.poll());
		 System.out.println(queue);
			String b[]= new String[queue.size()];
			int size=0;
			it = queue.iterator();
			while(it.hasNext())
			{
				b[size] = it.next();
				size++;
			}
			System.out.println("Array is : "+Arrays.toString(b));
			
		/*for(int i=queue.size()-1;i>0;i--)
			System.out.println(queue.get(i));
		System.out.println("Inserting the specified element 'YELLOW' at the specified position 2 in the priority queue");
		queue.add(1, "Yellow");
		System.out.println(queue);
		System.out.println("Inserting elements into the priority queue at the first and last position");
		queue.addFirst("PURPLE");
		queue.addLast("ROSE");
		System.out.println(queue);
		System.out.println("To insert the specified element at the front of a priority queue");
		queue.offerFirst("PINK");
		System.out.println(queue);
		System.out.println("To insert the specified element at the end of a priority queue");
		queue.offerLast("WHITE");
		System.out.println(queue);
		System.out.println("To insert some elements at the specified position 2 into a priority queue.");
		queue<String> queue1 = new queue<String>();
		queue1.add("SILVER");
		queue1.add("BLACK");
		queue.add("ORANGE");
		queue.addAll(1, queue1);
		System.out.println(queue);
		System.out.println("To get the first and last occurrence of the specified elements in a priority queue");
		System.out.println(queue.getFirst());
		System.out.println(queue.getLast());
	*/
		
	}

}
