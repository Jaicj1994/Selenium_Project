package Selenium_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Web_table {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaicj\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
						
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/index.php?rp=/login");
		
		  WebElement register=driver.findElement(By.partialLinkText("Register"));
		  register.click();
		  
		  Actions actions= new Actions(driver);
		  
		  WebElement firstName=driver.findElement(By.id("inputFirstName"));
		  actions.sendKeys("Jaikumar").perform();
		  actions.sendKeys(Keys.TAB).perform();
		  actions.sendKeys("Eswaran").perform();
		  actions.sendKeys(Keys.TAB).perform();
		  actions.sendKeys("Jaikumarcj1@gmail.com").perform();
		  
		  actions.sendKeys(Keys.TAB).perform();
		  
		  WebElement country=driver.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/div"));
		  country.click();
		 
		  
		  
		  
		  
		
	}

}
