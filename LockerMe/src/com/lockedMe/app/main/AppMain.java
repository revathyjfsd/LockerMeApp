package com.lockedMe.app.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.lockedMe.app.exception.FileNotExistException;
import com.lockedMe.app.service.ProductServices;

public class AppMain {
	
	public static void main(String[] args) throws FileNotExistException,IOException{
		
		System.out.println("Welcome to LockedMe \n"
				+ "This Application is mainly to digitize the user specified files to be \n"
				+ "added/deleted/searched in the location specified by the user. \n"
				+ "This product is developed by the Company Lockers Pvt. Ltd\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root directory path:");
		//String path = "C:\\Users\\Administrator\\Files\\a\\";
		String path=sc.next();
		File f = new File(path);
		//s
		File[] files;
		boolean flag=f.exists();
		boolean flag1=f.isDirectory();
		if(flag && flag1)
		{
		ProductServices ps = new ProductServices();
		
			synchronized (sc) {
				while(flag){
				
				System.out.println("\nEnter any one number(1/2/3) "
						+ "for the below mentioned operation to be perfomed "
						+ "\n 1:Dipslay the file(s) in ascending order \n 2:Add/Delete/Search the file \n 3.Exit ");
				String key = sc.next();
				switch (key) {
				case "1":
					ps.display(ps.getFileList(f));
					break;
				case "2":
					flag1= true;
					while(flag1) {
						System.out.println("\nEnter any one option(a/b/c/d/) "
								+ "for the below mentioned operation to be perfomed "
								+ "\n a: Add a new file \n"
								+ " b: Search the file\n "
								+ "c: Delete the file \n "
								+ "d: Go to main content");
					String input = sc.next();
					switch(input)
					{
					case "a":
						System.out.println("\nEnter the file to be added");
						String fileName =sc.next();
						if(fileName!=null)
							ps.addNewFile(fileName, path);
						break;
					case "b":
						System.out.println("\nEnter the file name to search in the current directory "+path);
						String fileName1 =sc.next();
						if(fileName1!=null)
							ps.searchFile(ps.getFileList(f), fileName1);
						break;
						
					case "c":
						System.out.println("\nEnter the file name to be deleted");
						String fileName2 =sc.next();
						if(fileName2!=null)
							ps.deleteFile(ps.getFileList(f), fileName2);
						break;	
					case "d":
						flag1 = false;
						break;	
					default:
						System.out.println("Enter the correct option");
					}
					}
					continue;
				case "3":
					System.out.println("Thanks for using the LockerMe App");
					flag = false;
					break;
				default:
					System.out.println("Enter the correct option");
				}
			}
			}
		}
		else{
			System.out.println("This is not a Directory");
		}
	}
}
