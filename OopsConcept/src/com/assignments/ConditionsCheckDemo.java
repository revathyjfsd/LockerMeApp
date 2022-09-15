package com.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConditionsCheckDemo {

	private void numberPostiveOrNegative(int i) {
		if (i < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is positive");
		}
	}

	private void greatestNumber(List<Integer> list) {
		int max = list.get(0);
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			int input = i.next();
			if (max < input)
				max = input;
		}
		System.out.println("maximum value is " + max);

	}

	private void smallestNumber(List<Integer> list) {
		int min = list.get(0);
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			int input = i.next();
			if (min > input)
				min = input;
		}
		System.out.println("minimum value is " + min);

	}

	private void average(List<Integer> list) {
		float average = 0;
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			float input = i.next();
			average = average + input;
		}
		System.out.println("average value is " + average / list.size());
	}

	private void sumOfDigits(int num) {
		String s = Integer.toString(num);
		int sum = 0;
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			sum = sum + Integer.parseInt(String.valueOf(array[i]));
			// System.out.println("array : "+array[i]);

		}
		System.out.println("sum of the interger value " + num + " is " + sum);
	}

	private void findMiddleOfString(String name) {

		int lenght = name.length();
		char[] array = name.toCharArray();
		if ((lenght % 2) > 0)
			System.out.println(array[lenght / 2]);
		else
			System.out.println(array[(lenght / 2) - 1] + "" + array[lenght / 2]);

	}

	private void countNoOfWordsInString(String name) {
		System.out.println(name);
		StringTokenizer s = new StringTokenizer(name);
		System.out.println(s.countTokens());
		int  i=0;
		while(s.hasMoreElements()){
			i++;
			s.nextElement();
		}
		System.out.println(i);
	}

	private void leaporNotALeapYear(int year) {
		try {
			
		if ((year % 4) > 0) {
			System.out.println(year + " is not a Leap year");
		} else {

			if ((year % 100) > 0) {
				System.out.println(year + " is a Leap year");
			} else {
				if ((year % 400) > 0) {
					System.out.println(year + " is not a Leap year");
				} else
					System.out.println(year + " is a Leap year");
			}
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

	private void areaOfCircle(int radius) {
		System.out.println("Area of the circle of radius " + radius + " is " + Math.PI * (radius * radius));

	}

	private void quadraticEquation(int a, int b, int c) {
		System.out.println(" a " + a);
		System.out.println(" a " + b);
		System.out.println(" a " + c);
		double d = (b * b) - (4 * a * c);
		System.out.println(" d " + d);
		double root1;
		double root2;
		if (d > 0) {
			d = (Math.sqrt(d));
			root1 = (-b + d) / (2 * a);
			root2 = (-b - d) / (2 * a);
			System.out.println(" root1 " + root1 + " root2 " + root2);
		} else if (d == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.println(" root1 " + root1 + " root2 " + root2);
		} else {
			root1 = -b / (2 * a);
			root2 = Math.sqrt(-d) / (2 * a);
			System.out.println(" root1 " + root1 + " root2 " + root2);

		}
		// System.out.println(" root2 "+ root2);
		// System.out.println("the roots are "+ root1 + " and "+ root2);

	}

	private void nameOfWeek(int i) {
		Map<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "Monday");
		hash.put(2, "Tuesday");
		hash.put(3, "Wednesday");
		hash.put(4, "Thurday");
		hash.put(5, "Friday");
		hash.put(6, "Satday");
		hash.put(7, "Sunday");

		System.out.println(hash.get(i));

	}

	private void vowelOrConsonant(String s) {
		String vowels[] = { "a", "e", "i", "o", "u" };
		boolean flag = false;
		try
		{
		Pattern p = Pattern.compile("[a-zA-Z]");
		Matcher m = p.matcher(s);

		if (s.length() > 1) {
			System.out.println("You have typed more than one letter");

		} else if (m.matches()) {

			for (int i = 0; i < vowels.length; i++) {
				if (s.equalsIgnoreCase(vowels[i])) {
					flag = true;
					break;
				}

			}
			if (flag == true) {
				System.out.println("It is a vowel letter");
			} else
				System.out.println("It is not a vowel letter");
		} else {
			System.out.println("You have not entered an alphabet ");
		}
		}catch (Exception e) {
		System.out.println(e);
		}
		finally {
			
		}
	}

	private void sumOfNaturalNos(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of the first " + num + " natural number is " + sum);
	}

	private void cubeOfNnos(int num) {
		int cube;
		for (int i = 1; i <= num; i++) {
			cube = i * i * i;
			System.out.println("cube of the " + i + " is " + cube);
		}

	}
	private void sumOfPair(int[] a,int num) {
		boolean flag = false;
		for (int i = 0; i <a.length-1; i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]+a[j]) == num) {
					System.out.println("The pair "+a[i]+" and " +a[j]+ " makes the specified value "+ num);
					flag = true;
			}
			}
		}
		if(flag == false)
		{
			System.out.println("The sum of the pair in the array does not make the specified number "+ num);
		}

	}
	private void equalArrayOrNot(int[] a,int[] b) {
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for (int i = 0; i <a.length; i++) {
			if(a[i] != b[i]) {
					System.out.println("The arrays are not equal");
					return;
					}
			}
		}
	private void arrayListToArray(ArrayList<String> list)
	{
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
	}

	public static void main(String args[]) {
	
		try
		{
			ConditionsCheckDemo c = new ConditionsCheckDemo();
		Scanner s = new Scanner(System.in);
/*
		
		  System.out.println("Enter the number to check is is positive or negative");
		  c.numberPostiveOrNegative(s.nextInt());
		  System.out.println("Enter four number"); List<Integer> list = new
		  ArrayList<Integer>(); list.add(s.nextInt()); list.add(s.nextInt());
		  list.add(s.nextInt()); list.add(s.nextInt()); c.greatestNumber(list);
		  c.smallestNumber(list); c.average(list);
		  
		  System.out.println("Enter a number to add all digits in it");
		  int i =s.nextInt();
		  c.sumOfDigits(i);
		  System.out.println("Enter a string to find the middle letter: ");
		  String words = s.next();
		  c.findMiddleOfString(words);
		  Scanner d = new Scanner(System.in);
		  System.out.println("Enter a sentence  to find the number of words in it: ");
		  String name = d.nextLine();
		  c.countNoOfWordsInString(name); 
		  
		 
			  System.out.println("Enter a year to find out it is a leap year or not a leap year: "); 
			  i= d.nextInt(); 
			  c.leaporNotALeapYear(i);
			  
			  System.out.println("Enter a radius of circle to find the area of it  "); i =
			  s.nextInt(); c.areaOfCircle(i);
			  
			  System.out.println("Enter three number to find the quadratic equation"); 
			  int n1= s.nextInt();
			  int n2= s.nextInt();
			  int  n3= s.nextInt();
			  c.quadraticEquation(n1,n2,n3);
			  
			  System.out.println("Enter an integer between 1 to 7 to find the week of the day");
			  c.nameOfWeek(s.nextInt());
			  System.out.println("Enter a letter to check whether it is vowel or not");
			  c.vowelOrConsonant(s.next()); 
			  System.out.println("Enter a number to find the Sum of the first n natural numbers");
			  c.sumOfNaturalNos(s.nextInt()); 
			  System.out.println("Enter a number to find the cube of the first n natural numbers");
			  c.cubeOfNnos(s.nextInt());
			 */
			  int[] a = {2,3,4,5,6};
			  int[] b = {2,3,4,5,6};
			  System.out.println("Enter a number to find all pairs of elements in an array whose sum is equal to a entered number");
			  int specifiednumber =s.nextInt();
			  c.sumOfPair(a,specifiednumber);
			  c.equalArrayOrNot(a, b);
			  ArrayList<String> listString = new ArrayList<String>(); 
			  
			  listString.add("JAva");
			  listString.add("ohp");

			  listString.add("c++");

			  listString.add(">NEt");
			  c.arrayListToArray(listString);
			  s.close();
			//  d.close();
			 		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
