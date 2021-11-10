package Selenium_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.grid.node.locators.ByName;
import org.openqa.selenium.support.pagefactory.ByAll;

public class Frame_work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaicj\\Downloads\\chromedriver_win32\\Chrome_94\\chromedriver.exe");	
		
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--incognito");
				WebDriver driver = new ChromeDriver(option);
				driver.get("http://leafground.com/"); 	
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				
				WebElement frame=driver.findElement(By.xpath("//img[@alt='Frame']"));
				frame.click();
				driver.switchTo().frame(0);
				WebElement inside_frame=driver.findElement(By.id("Click"));
				inside_frame.click();
				System.out.println(inside_frame.getText());
				driver.switchTo().defaultContent();
				driver.switchTo().frame(1);
				WebDriver frame_text = driver.switchTo().frame("frame2");
				WebElement frame_2= driver.findElement(By.id("Click1"));
				frame_2.click();
				System.out.println(frame_2.getText());
				
				driver.switchTo().defaultContent();
				
//				driver.switchTo().frame(2);
//				WebElement frame_3=driver.findElement(By.linkText("count.html"));
//				frame_3.getText();
//				
				
//				List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\'quantity_wanted\']"));
//				findElements.clear();
				
				
				
			  
				
	}
}
