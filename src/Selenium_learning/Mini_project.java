package Selenium_learning;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mini_project {

			public static void main(String args[]) throws AWTException, InterruptedException
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaicj\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				
				
				driver.manage().window().maximize();
				driver.get("http://automationpractice.com/index.php");
				
				Actions actions=new Actions(driver);
				
				WebElement womens=driver.findElement(By.partialLinkText("Women"));
				actions.contextClick(womens).perform();
				
				Robot rb=new Robot();
				rb.keyPress(KeyEvent.VK_DOWN);
				rb.keyRelease(KeyEvent.VK_DOWN);
				
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
				
				String parentID=driver.getWindowHandle();
				Set<String> child_web=driver.getWindowHandles();
				Thread.sleep(5000);
				
				for(String st:child_web)
				{
					if(!st.equals(parentID)) {
					driver.switchTo().window(st);
					}
					
					WebElement dress=driver.findElement(By.xpath("//img[@title='Printed Summer Dress']"));
					JavascriptExecutor jse=(JavascriptExecutor)driver;
					jse.executeScript("arguments[0].scrollIntoView(true)",dress);
					dress.click();
					WebElement add=driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
					add.click();
					actions.sendKeys("2");
					
					
				}
				
				

}
}
