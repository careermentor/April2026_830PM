package org.wipro.auto.ecommerce.utilties;


import java.io.FileReader;
import java.util.Properties;

public class ReadProperties 
{

	public static String readconfig(String key) throws Exception
	{
		FileReader fr= new FileReader("./configrationfile/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readelement(String key) throws Exception
	{
		FileReader fr= new FileReader("./configrationfile/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
}
