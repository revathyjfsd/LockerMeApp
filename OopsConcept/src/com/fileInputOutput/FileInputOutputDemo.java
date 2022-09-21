package com.fileInputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class FileInputOutputDemo {
public static void main(String args[])
{
	try {
		File f= new File("src/logger.log.txt");
		
		FileOutputStream fos = new FileOutputStream(f); 
		byte b1[]="Hi".getBytes(); 
		fos.write(b1);
		 
		FileInputStream fis = new FileInputStream(f);
		int b;
		while((b=fis.read())!=-1)
		{
			System.out.println(""+(char)b);
		}
		//System.out.println(b);
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(IOException ie)
	{
		ie.printStackTrace();
	}
	
	
	 try { File f= new File("src/File1.txt"); OutputStream os = new
	 FileOutputStream(f); DataOutputStream dos = new DataOutputStream(os);
	 dos.writeBytes("how are you");
	 InputStream is = new FileInputStream(f);
	 DataInputStream dis = new DataInputStream(is);
	 byte[] b1 = new byte[is.available()];
	 while(dis.available()>0)
	 {
		b1= dis.readAllBytes();
	 }
	 for(byte bytes:b1)
		 System.out.println(""+(char)bytes);

	 String s = new String(b1);
	 System.out.println(s);
	 StringTokenizer st = new StringTokenizer(s, " ");
while(st.hasMoreElements())
{
	System.out.println(st.nextElement()+" ");
}
FileWriter fw = new FileWriter("src/File1.txt",true); //the true will append the new data
fw.write("add a line\n");//appends the string to the file

fw.close();
FileReader fr = new FileReader(f);
int b2;
while((b2=fr.read())!=-1)
	System.out.println((char)b2);
	 
	 }catch (IOException e) { // TODO Auto-generated catch block
	 e.printStackTrace(); }
	
	 }


}
