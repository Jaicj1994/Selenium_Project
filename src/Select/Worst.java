package Select;

import java.util.Scanner;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Worst {

	public static void main(String[] args) {
		
		String name="Jaikumar";
		int number =5;
		
		
		System.out.println(name.charAt(2));
		System.out.println(name.contains("a")); 
		System.out.println(name.indexOf(4));
		System.out.println(name.substring(5));
		System.out.println(name.substring(1, 7));
		System.out.println(name.toUpperCase());
		System.out.println(String.valueOf(number));
		System.out.println(name.length());
		System.out.println(name.equals("Kumar"));
		System.out.println(name.equalsIgnoreCase("JAIKUMAR"));
		System.out.println(name.replace("Jaikumar", "Goutham"));
		System.out.println(name.replace("Jai", "Gou"));
		
		System.out.println(String.join("/",name,String.valueOf(number)));
		System.out.println(String.join("-!","09","08","1009"));
		System.out.println(name.replaceAll("Jaikumar","Gou"));
		
		StringBuffer name1=new StringBuffer("Jai");
		System.out.println(name1.insert(1, "Kumar"));
		System.out.println(name1.reverse());
		System.out.println(name1.capacity());
		System.out.println(name1);
		
		
		
		
		
		
	}
	
	}


		
	

