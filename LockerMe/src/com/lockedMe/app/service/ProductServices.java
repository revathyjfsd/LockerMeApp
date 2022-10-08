package com.lockedMe.app.service;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.lockedMe.app.exception.FileNotExistException;

public class ProductServices {
	

	public File[] sortFilesInAscendingOrder(File[] files) throws FileNotExistException
	{
		if(files.length>0)
		{
			Arrays.sort(files);
		}
		return files;
				
	}
	
	public File[] getFileList(File f) throws FileNotExistException
	{		
		FileFilter ff = new FileFilter() {
			
			@Override
			public boolean accept(File f) {
				// TODO Auto-generated method stub
				return !f.isDirectory();
			}
		};
		File[] files= f.listFiles(ff);
		if(files.length<1)
		{
			throw new FileNotExistException();
		}
		return files;
		
	}
	public void display(File[] files) 
	{
		System.out.println("Displaying the files in ascending order:");
		if(files.length>0)
		{
			for(File fi :files)
			{
				System.out.println(fi.getName());
			}
		}

	}
	public File[] sortFilesInDescendingOrder(File[] files) 
	{
		
		if(files.length>0)
		{
			Collections.sort(Arrays.asList(files),Comparator.reverseOrder());
		}
		return files;
		
	}
	public void addNewFile(String fileName, String path) throws IOException
	{
		
		File newfile = new File(path+fileName);
		boolean flag = newfile.createNewFile();
		if(flag)
		{
			System.out.println("File '"+fileName+ "' is created in the path "+path);
		}
		else
		{
			System.out.println("Error occurred while creating new File");
					
		} 
		
}
		
	public void deleteFile(File[] files,String fileName) 
	{
			boolean flag = false;
			if(files.length>0)
			{
				for(File fi :files)
				{
					if(fi.getName().equals(fileName))
					{
					fi.delete();
					flag = true;
					System.out.println("\nDeleting " +fileName +" is successful");
					}
				}
				if(!flag)
				{
					System.out.println("Delete operation failed as the file '"+fileName+ "' is not found");
				}
			}
		}
	
	public void searchFile(File[] files,String fileName) 
	{
		boolean flag = false;	
			if(files.length>0)
			{
				for(File fi :files)
				{
					if(fi.getName().equalsIgnoreCase(fileName))
					{
					System.out.println("\nSearch operation is successful. '"+fileName +"' is found");
					flag = true;
					break;
					}
				}
				if(!flag)
				{
					System.out.println("\n'"+fileName+ "' is not found");
				}
			}
		}
}
