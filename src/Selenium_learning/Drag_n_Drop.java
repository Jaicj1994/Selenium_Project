package Selenium_learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Drag_n_Drop {
	
	public static void main (String agrs[]) throws InterruptedException
	{
		  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaicj\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		  	WebDriver driver= new ChromeDriver();
		  	
		 	Actions builder =new Actions(driver);
		  	driver.get("http://dhtmlgoodies.com/index.html?page=dragDrop");
		  	driver.manage().window().maximize();
		  	WebElement demo2=driver.findElement(By.partialLinkText("Demo 1"));
		  	demo2.click();
		  	
		  	WebElement box3=driver.findElement(By.id("box1"));
		  	
		  	WebElement dropBox1=driver.findElement(By.id("dropBox"));
		  	builder.clickAndHold(box3).moveToElement(dropBox1).perform();
//		  	
//		  	builder.dragAndDrop(box3, dropBox1).build().perform();
		  	
	}

}
