package Selenium_learning;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Booking {

	public void openChrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaicj\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions builder = new Actions(driver);
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("jaikumar267");
		builder.sendKeys(Keys.TAB).perform();
		builder.sendKeys("Gouthamjai").perform();
		builder.sendKeys(Keys.ENTER).perform();;
		WebElement location = driver.findElement(By.id("location"));

		Select select = new Select(location);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		System.out.println(location.getText());

		select.selectByIndex(5);
		builder.sendKeys(Keys.TAB).perform();
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.TAB).perform();
		builder.sendKeys(Keys.ENTER).perform();
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.DOWN.ENTER).perform();
		builder.sendKeys(Keys.TAB).perform();
		builder.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.DOWN.TAB).perform();

		builder.sendKeys("09/10/2021").sendKeys(Keys.TAB).sendKeys("10/10/2021").sendKeys(Keys.TAB.DOWN)
				.sendKeys(Keys.DOWN).build().perform();

		builder.sendKeys(Keys.TAB.ENTER).perform();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Jaikumar");
		builder.sendKeys(Keys.TAB).sendKeys("Eswaran").sendKeys(Keys.TAB).sendKeys("porur").perform();
		builder.sendKeys(Keys.TAB).sendKeys("987654378987698762").sendKeys(Keys.TAB).perform();
		builder.sendKeys(Keys.DOWN).sendKeys(Keys.TAB).sendKeys(Keys.DOWN).sendKeys(Keys.TAB).sendKeys(Keys.DOWN)
				.sendKeys(Keys.DOWN).perform();
		builder.sendKeys(Keys.TAB).sendKeys("1234").perform();

		builder.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement booking = driver.findElement(By.id("my_itinerary"));
		booking.click();
		
		driver.findElement(By.id("logout")).sendKeys(Keys.ENTER);
		
		
	}

	public static void main(String args[]) throws AWTException, InterruptedException {

		Hotel_Booking hotel = new Hotel_Booking();
		hotel.openChrome();

	}

}
