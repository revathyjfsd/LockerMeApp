package com.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String args[])
	{
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("RED");
		hashSet.add("BLUE");
		hashSet.add("ORANGE");
		hashSet.add("GREEN");
		hashSet.add("GREEN");
		System.out.println("the hashset is "+ hashSet);
		System.out.println("the number of elements in a hash set: "+hashSet.size());
		/*Iterator< String> i =  hashSet.iterator();
		while(i.hasNext())
		{
			System.out.println("iterating through all elements in a hash list " +i.next());
		}*/
		
		Set hashSet1 = new HashSet();
		hashSet1 = (HashSet)hashSet.clone();
		System.out.println("the hashSet1 is clone of hashSet: "+hashSet1);
		hashSet1.clear();
		System.out.println("Cleared the entire hashSet1 "+ hashSet1);
		
		System.out.println("To check a hash set1 is empty or not: "+ hashSet1.isEmpty());
		if(hashSet1.isEmpty())
		{
			System.out.println("HashSet1 is empty");
		}
		else
		{
			hashSet1.clear();
			System.out.println("HashSet after removing all items "+hashSet);
		}
		hashSet1 = (HashSet)hashSet.clone();
		System.out.println("Cloned both the hashSet");
		System.out.println("To check Both hashSet and hashset1 are equal "+hashSet1.equals(hashSet));
		hashSet1.add("YELLOW");
		hashSet1.add("PURPLE");
		System.out.println(""+ hashSet+ "  :  "+hashSet1);
	Iterator< String> i =  hashSet.iterator();
	Iterator< String> i1 =  hashSet1.iterator();
	int difference = hashSet.size()-hashSet1.size();
	System.out.println("Does HashSet contains HashSet1 " +hashSet.containsAll(hashSet1));
	System.out.println("Does HashSet1 contains HashSet " +hashSet1.containsAll(hashSet));
	System.out.println("The diffecnce in size of two hashSet is "+difference);
	if(difference>=0)
	{
		while(i.hasNext())
		{
			String b = i.next();
			if(hashSet1.contains(b))
			{
			System.out.println("The element " + b + " is present in both the hashSet1 ");
			}
			else
			{
			System.out.println("The element " + b + " is not present in other hashSet1 ");
			}
		}
	}
	else
	{
	while(i1.hasNext())
	{
		String a= i1.next();
		if(hashSet.contains(a))
		{
		System.out.println("The element " + a + " is present in both the hashSet ");
		}
		else
		{
		System.out.println("The element " +  a + " is not present in other hashSet ");
		}
			
	}
	}
	System.out.println("To convert to arraylist ");
	String b[]= new String[hashSet.size()];
	int size=0;
	while(i.hasNext())
	{
		b[size] = i.next();
		size++;
	}
	System.out.println("Array is : "+Arrays.toString(b));
	
	ArrayList<String> arrayList = new ArrayList<String>(hashSet);
	System.out.println("ArrayList is : "+arrayList);
	TreeSet<String> ts = new TreeSet<>(hashSet);
	System.out.println("TreeSet is " + ts);
	}
}