package com.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayDemo {
	private void sortArray(int[] numbers, String order)
	{
		if(order.equals("D"))
		{
			Arrays.sort(numbers);
			System.out.println("Sorted Array in descending order " +Arrays.toString(numbers));
		}
		else if(order.equals("A"))
		{
			int temp =0;
			for (int i = 0; i < numbers.length; i++) {     
	            for (int j = i+1; j < numbers.length; j++) {     
	               if(numbers[i] > numbers[j]) {    
	                   temp = numbers[i];    
	                   numbers[i] = numbers[j];    
	                   numbers[j] = temp;    
	               }     
	            }     
			}    
			System.out.println("Sorted Array in ascending order " +Arrays.toString(numbers));
		}
	}
	private void arrayProcessing(int[] numbers)
	{
		int max=0;
		int min= 0;
		int average = 0;
		max = numbers[0];
		min= numbers[0];
		//Code to find the maximum number in a array
		for(int i : numbers)
		{
			if(max<i)
				max= i;
		}
		System.out.println("Maximum value is "+max);
		
		//Code to find the minimum number in a array
		for(int i : numbers)
		{
			if(min>i)
				min= i;
		}
		System.out.println("Minimum value is "+min);
		
		//Code to find the average of numbers in a array
		for(int i : numbers)
		{
			average = average+i;
		}
		System.out.println("average value is "+(average/(numbers.length)));
		
		//Code to find the duplicate values
		int duplicateValue = 0;
		int c=1;
		boolean flag = false;
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					duplicateValue = numbers[i];
					c++;
					flag = true;
				}
			}
			if(c >1)
			{
				System.out.println(" the value " +duplicateValue + " has occurred "+ c + " times");
			}
			c=1;
		}
		if(flag== false)
		{
			System.out.println("No duplicate Values");
		}
		
		
		//Code to find the common value in three array
		int duplicateValue1 = 0;
		int c1=1;
		boolean flag1 = false;
		int[] numbers1= {2,3,4,5,6};
		int[] numbers2= {2,3,4,5,6,7,8};
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers1.length;j++)
			{
				if(numbers[i]==numbers1[j])
				{
					for(int k=0;k<numbers2.length;k++)
					{
						if(numbers[i]==numbers2[k])
						{
							duplicateValue1 = numbers[i];
							c1++;
							flag1 = true;
						}
					}
					
				}
			}
			if(c1 >1)
			{
				System.out.println(" the value " +duplicateValue1 + " has occurred in all the three array");
			}
			c1=1;
		}
		if(flag1== false)
		{
			System.out.println("No duplicate Values");
		}

		//Code to reverse the order of array
				int temp=0;
				for(int i=0;i<(numbers.length/2);i++)
				{
					for(int j=numbers.length-1;j>(numbers.length/2);j--)
					{
						temp=numbers[j];
						numbers[j]=numbers[i];
						numbers[i]=temp;
					}
				}
				System.out.println("Reverse of array " +Arrays.toString(numbers));

		//Code to find the maximum number in a array
		int index=0;
		max = numbers[0];
		for(int i : numbers)
		{
			if(max<i)
			{
				max= i; index++;
			}
		}
		int[] duplicate = numbers;
		duplicate[index]=0;
		max= duplicate[0];
		for(int i : duplicate)
		{
			if(max<i)
				max= i;;
		}
		System.out.println("Second Maximum value is "+max);

		
	}
		public static void main(String args[])
	{
		ArrayDemo a = new ArrayDemo();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 5 numbers to sort it.");
		int[] numbers= {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
		System.out.println("Enter the order to be sorted ascending or desending by Typing 'A' or 'D'");
		String order = s.next();
		a.sortArray(numbers,order);
		a.arrayProcessing(numbers);
		s.close();
	}
}
	