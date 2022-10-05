package com.lockedMe.app.main;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class newMain {
public static void main(String[] args) throws IOException  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the file name");
	String filename=sc.next();
	FileInputStream fi=new FileInputStream(filename);
	int i=0;
	String s="";
	while((i=fi.read())!=-1) {
		s = s+((char)i);
	}
	fi.close();
	FileWriter fo=new FileWriter("sample.txt",true);
	fo.write(s);
	System.out.println("write operation completed");
	fo.close();

}
}

