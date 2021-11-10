package Selenium_learning;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Window_handles {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaicj\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(3000);
		cancel.click();

		Actions actions = new Actions(driver);

		WebElement list_box = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));

		actions.moveToElement(list_box).perform();
		Thread.sleep(3000);

		Robot rb = new Robot();

		WebElement t_shirt = driver.findElement(By  
				.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[2]"));

		actions.contextClick(t_shirt).build().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		WebElement electronic = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		actions.moveToElement(electronic).perform();
		Thread.sleep(3000);
		WebElement bluetooth = driver.findElement(By
				.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[2]"));
		actions.contextClick(bluetooth).build().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		//Windows handling Concept
		String main_window = driver.getWindowHandle();

		int size = driver.getWindowHandles().size();
		System.out.println("Total open window count :" + size);

		Set<String> windowHandles = driver.getWindowHandles();

		for (String allwindow : windowHandles) {
			if (!allwindow.equals(main_window)) {
				Thread.sleep(3000);
				System.out.println(driver.switchTo().window(allwindow).getTitle());
				driver.close();
			}
			
		}

	}

}
