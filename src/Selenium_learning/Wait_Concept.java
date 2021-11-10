package Selenium_learning;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wait_Concept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaicj\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://phptravels.net/login");
		
		
		Actions actions=new Actions(driver);
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("jaikumarcj1@gmail.com");
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys("Gouthamjai").perform();
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys(Keys.TAB).perform();
		actions.sendKeys(Keys.ENTER).perform();
		
		WebElement myprofile=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a"));
		myprofile.click();
		

	}
}