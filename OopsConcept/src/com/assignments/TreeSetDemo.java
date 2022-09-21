package com.assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("RED");
		treeSet.add("BLUE");
		treeSet.add("ORANGE");
		treeSet.add("GREEN");
		treeSet.add("GREEN");
		treeSet.add("WHITE");
		treeSet.add("YELLOW");
		treeSet.add("PURPLE");
		treeSet.add("BLAXK");
		
		System.out.println("the treeSet is "+ treeSet);
		System.out.println("the number of elements in a Tree set: "+treeSet.size());
		Iterator<String> i =  treeSet.iterator();
		while(i.hasNext())
		{
			System.out.println("iterating through all elements in a TreeSet" +i.next());
		}
		Set treeSet1 = new TreeSet();
		treeSet1.addAll(treeSet);
		System.out.println("Adding all tree set entries to an other tree set"+treeSet1);
		Set treeSet2 = new TreeSet();
		treeSet2 = (TreeSet)treeSet.clone();
		System.out.println("Cloned Tree set is: "+treeSet2);
		Iterator<String> it =treeSet.descendingIterator();
		while(it.hasNext())
		{
			System.out.println("iterating through all elements reverse order in a TreeSet " +it.next());
		}
		System.out.println("First entry: "+treeSet.first());
		System.out.println("Last entry: "+treeSet.last());
		TreeSet ts = new TreeSet<Integer>();
		ts.add(9);
		ts.add(6);
		ts.add(7);
		ts.add(9);
		ts.add(2);
		TreeSet<Integer> ts1=(TreeSet) ts.headSet(7);
		System.out.println("New Interger TreeSet: "+ts);
		System.out.println("To find the numbers less than 7 in a tree set: " +ts1);
		System.out.println("to get the element in a tree set which is greater than or equal to the given element 6 : "+ts.ceiling(6));
		System.out.println("does TreeSet contains the TreeSet2:   "+treeSet.containsAll(treeSet2));
	}
	

}
