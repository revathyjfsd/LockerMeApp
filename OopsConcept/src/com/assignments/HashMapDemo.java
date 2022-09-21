package com.assignments;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;




public class HashMapDemo {
	public static void main(String args[])
	{
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1,"Jack");
		hashMap.put(2,"Rose");
		hashMap.put(4,"Sam");
		hashMap.put(5,"Linda");
		Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
		hashtable.put(1,"Jack");
		hashtable.put(2,"Rose");
		hashtable.put(4,"Sam");
		hashtable.put(5,"Linda");
		System.out.println(hashtable);
		System.out.println("the number of key-value (size) mappings in a mapHash Map is "+hashMap.size());
		Map<Integer,String> hashMap1 = new HashMap<Integer,String>();
		hashMap1.put(2,"Ken");
		hashMap1.put(6,"Siva");
		hashMap1.put(3,"Ann");
		System.out.println("hashMap "+hashMap);
		System.out.println("hashMap1 "+hashMap1);
		hashMap1.putAll(hashMap);
		System.out.println("copied all of the mappings from the hashmap to another map hashmap1: "+hashMap1);
		hashMap1.clear();
		System.out.println("removed all the mappings from a map hashMap1: "+hashMap1);
		System.out.println("hashMap1 contains key-value mappings (empty) true or false: "+hashMap1.isEmpty());
		Map<Integer,String> hashMap3 = new HashMap<Integer,String>();
		hashMap3= hashMap;
		System.out.println("shallow copy of a HashMap to hashMap3 "+hashMap3);
		if(hashMap3.containsKey(3))
			
			System.out.println("map contains a mapping for the specified key '3': ");
		if(hashMap3.containsValue("Rose"))
			System.out.println("map contains a mapping for the specified value 'Rose' ");
		Set s = hashMap3.entrySet();
		System.out.println("set view of the mappings contained in a map "+s);
		System.out.println("getting the value of a specified key '1' in a map "+hashMap.get(1));
		for(Map.Entry<Integer, String> m :hashMap3.entrySet())
		{
				
				System.out.println("key is "+m.getKey()+" and the value is "+m.getValue());
			
		}
		
	}
}
