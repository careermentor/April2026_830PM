package firstpkg;

import java.io.File;

import java.io.FileReader;
import java.util.Properties;

public class FileHandling
{

	public static void readpropdata() throws Exception
	{
		//File f = new File("./testdata/abc.properties");
		
		FileReader fr = new FileReader("./testdata/abc.properties");	
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		System.out.println(prop.get("name"));
		
		System.out.println(prop.get("mob"));
		
	}
	
	
	public static void readtextdata() throws Exception
	{
		File f = new File("C:\\TestData\\data.txt"); //file connection
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();
		
		
		while(r!=-1) //true
		{
			System.out.print((char)r);
			r=fr.read();
		}
		
		
		/*
		
		System.out.print((char)r);
		
		r=fr.read();
		System.out.print((char)r);
		
		r=fr.read();
		System.out.print((char)r);
		
		r=fr.read();
		System.out.print((char)r);
		
		r=fr.read();
		System.out.print((char)r);
		
		r=fr.read();
		System.out.print((char)r);
		
		*/
	}
	
	
	public static void main(String[] args) throws Exception
	{
	
		readpropdata();
		
	}
}
