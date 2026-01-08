package com.prowings.collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		
		props.setProperty("username", "ProWings");
		props.setProperty("password", "P@ssw0rd");
		props.setProperty("dburl", "www.db.com");
	
		
		System.out.println(props);
		
		System.out.println(props.getProperty("username2"));
		System.out.println(props.get("username"));

		Properties props2 = new Properties();
		
		
		try {
//			FileInputStream stream = new FileInputStream("application.properties");
			FileInputStream stream = new FileInputStream("C:\\Users\\Shree\\java14\\j14_collection\\src\\application.properties");
			props2.load(stream);
			
		}catch (FileNotFoundException e) {
			System.out.println("Error while loading application properties-- file not found!!!");
		}
		catch (IOException e) {
			System.out.println("Error while loading application properties!!!");
			e.printStackTrace();
		}
		
		System.out.println("key = aaa  = "+props2.getProperty("aaa"));
		System.out.println("key = secret  = "+props2.getProperty("secret"));
		System.out.println("key = userName  = "+props2.getProperty("userName"));
		System.out.println("key = url  = "+props2.getProperty("url"));
		
	}
	
}
