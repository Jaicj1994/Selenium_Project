package Selenium_learning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Java_script {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaicj\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		JavascriptExecutor jse= (JavascriptExecutor)(driver);
		jse.executeScript("window.scroll(0,1000)");
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement scroll=driver.findElement(By.xpath("//a[text()=' ONLINE SHOPPING ']"));
		jse.executeScript( "arguments[0].scrollIntoView(true)",scroll); 
		System.out.println(scroll.getText());
	}

}
