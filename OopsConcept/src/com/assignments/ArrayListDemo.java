package com.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayListDemo {
	private void sortArrayList(ArrayList list)
	{
		Collections.sort(list);
		
		System.out.println("In ascending order " +list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("In descending order " +list);

		
		String name = "who are you";

		StringTokenizer s = new StringTokenizer(name, " ");
		System.out.println(s.countTokens());
		
		ArrayList<String> list1 = new ArrayList<String>(); 
		list.add(s);
		list1.add("who");
		list1.add("are"); list1.add("you"); 
		
		list1.toString();
		 
		Collections.sort(list1);
		System.out.println("In String format "+list1);
		
	} 
	public static void main(String args[])
	{
		ArrayListDemo a = new ArrayListDemo();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 5 numbers to sort it.");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(s.nextInt());
		list.add(s.nextInt());
		list.add(s.nextInt());
		list.add(s.nextInt());
		System.out.println("List entered is "+list);
		a.sortArrayList(list);
		
		System.out.println("Enter the 5 string for processing");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add(s.next());
		list1.add(s.next());
		list1.add(s.next());
		list1.add(s.next());
		System.out.println("List entered is "+list1);
		for(String color : list1)
			System.out.println("Printing through iteration "+color.toString());
		System.out.println("Inserting element at 1st position ");
		list1.add(0, "Purple");
		System.out.println(list1);
		System.out.println("enter the list index to get replaced +");
		int replaceIndex1 = (s.nextInt())-1;
		int replaceIndex2 = (s.nextInt())-1;
		String temp = list1.get(replaceIndex1);
		list1.set(replaceIndex1, list1.get(replaceIndex2));
		list1.set(replaceIndex2, temp);
		System.out.println(list1);

		ArrayList<String> list2 = (ArrayList<String>)list1.clone();
		System.out.println("Cloned list " +list2);
list2.remove("Purple");
System.out.println("Removing purple form list "+list2);
list2.removeAll(list2);
System.out.println("Removing all form cloned list "+list2);
list1.ensureCapacity(100);
 list1.add(5,"Red"); list1.add(6,"Orange"); list1.add(7,"Blue");

System.out.println("Increase capacity to add 3 more strings "+list1);
list1.ensureCapacity(3);
System.out.println("Increase capacity to add 3 more strings "+list1);



		s.close();
	
		
	}



}
