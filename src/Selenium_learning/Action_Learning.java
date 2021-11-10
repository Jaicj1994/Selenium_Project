package Selenium_learning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action_Learning {

	public static void main(String args[]) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaicj\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.youtube.com/");

		WebElement search_box = driver.findElement(By.xpath("//input[@id='search']"));
		search_box.sendKeys("selenium tutorial for beginners");
		search_box.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		WebElement video = driver.findElement(By.partialLinkText("Selenium WebDriver with Java"));

		Actions actions = new Actions(driver);
		actions.contextClick(video).build().perform();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		
		System.out.println(video.getText());
		
	
	}

}
