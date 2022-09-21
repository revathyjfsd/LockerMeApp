package com.assignments;


import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class sortKeys implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

	
	
}

public class TreeMapDemo {
	public static void main(String args[])
	{
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>(new sortKeys());
		treeMap.put(1,"Jack");
		treeMap.put(7,"Rose");
		treeMap.put(3,"Sam");
		treeMap.put(2,"Linda");
		System.out.println("the number of key-value (size) mappings in a mapHash Map is "+treeMap.size());
		TreeMap<Integer,String> treeMap1 = new TreeMap<Integer,String>();
		treeMap1.put(10,"Ken");
		treeMap1.put(4,"Siva");
		treeMap1.put(5,"Ann");
		System.out.println("treeMap "+treeMap);
		System.out.println("treeMap1 "+treeMap1);
		treeMap1.putAll(treeMap);
		System.out.println("copied all of the mappings from the treeMap to another map treeMap1: "+treeMap1);
		treeMap1.clear();
		System.out.println("removed all the mappings from a map treeMap1: "+treeMap1);
		System.out.println("treeMap1 contains key-value mappings (empty) true or false: "+treeMap1.isEmpty());
		//TreeMap<Integer,String> treeMap3 = new TreeMap<Integer,String>();
		TreeMap<Integer,String> treeMap3= treeMap;
		treeMap3.put(9,"Siva");
		treeMap3.put(8,"Ann");
		System.out.println("shallow copy of a treeMap to treeMap3 "+treeMap3);
		if(treeMap3.containsKey(3))
			
			System.out.println("map contains a mapping for the specified key '3': ");
		if(treeMap3.containsValue("Rose"))
			System.out.println("map contains a mapping for the specified value 'Rose' ");
		Set s = treeMap3.entrySet();
		System.out.println("set view of the mappings contained in a map "+s);
		System.out.println("getting the value of a specified key '1' in a map "+treeMap.get(1));
		System.out.println("To get all keys from the given a Tree Map: "+treeMap3.keySet());
		System.out.println("To get all values from the given a Tree Map: " +treeMap3.values());
		System.out.println("To get a key-value mapping associated with the greatest key: "+treeMap3.firstEntry());
		System.out.println("To get a key-value mapping associated with the least key: "+treeMap3.lastEntry());
		System.out.println("Reverse order view of the keys "+treeMap3.descendingKeySet());
		for(Map.Entry<Integer, String> m :treeMap3.entrySet())
		{
				System.out.println("key is "+m.getKey()+" and the value is "+m.getValue());
			
		}
		
	}
}
