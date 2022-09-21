package com.session4.arraylist;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("world");
		System.out.println("Hello" + buffer);
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.remove();
System.out.println(q.peek());



		Set<Integer> list = new LinkedHashSet<Integer>();
		list.add(12);list.add(13);list.add(14);list.add(15);
		System.out.println(list);
		//addition();
		//arrays();
		//arraysFromUser();
		multiDimesnionalArray();
	}
		public static void addition()
		{
		Scanner s= new Scanner(System.in);
		int a  = s.nextInt();
		int b= s.nextInt();
		System.out.println(a+b);
		}
		
		public static void arrays()
		{
		int a[] = new int[5];
		a[0]= 1;
		a[1]= 1;
		a[3]= 1;
		for (int i :a)
			System.out.println(i);
		}
		
		
		public static void arraysFromUser()
		{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the length of the array");
		int a  = s.nextInt();
		int[] array = new int[a];
		for (int i=0;i<a;i++)
		{
			System.out.println("enter the mark of the subject "+(i+1)+ " :");
			array[i]=s.nextInt();
		}
		for (int i :array)
			System.out.println(i);
		}
		
		public static void multiDimesnionalArray()
		{
		int a[][] = {{1,2,3},{5,6,7},{8,9,3}};
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
			System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number to serach the multidimensional array");
		int input  = s.nextInt(); 
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(input==a[i][j])
				{
					System.out.println("matches" +i+" "+j);
				return;
				}
			}
			System.out.println(i);
		}
}
		
		

	

}
