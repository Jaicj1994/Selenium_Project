package Selenium_learning;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webb_table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaicj\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/table");

		
		System.out.println("-------------------------Values in the Table-----------------");

		WebElement allrows = driver.findElement(By.id("simpletable"));
		List<WebElement> firstrow = allrows.findElements(By.tagName("tr"));
		for (WebElement row : firstrow) {
			System.out.println(row.getText());
		}
		List<WebElement> selectedrows = allrows.findElements(By.xpath("//tbody/tr"));
		int size = selectedrows.size();
		System.out.println("Total size:" + size);

		System.out.println("------------------Columns---------------");
		WebElement column = driver.findElement(By.xpath("//table[@id='simpletable']/tbody/tr"));
		List<WebElement> allcolumns = column.findElements(By.cssSelector("tbody tr"));
		for (WebElement webElement : allcolumns) {
			System.out.println(webElement.getText());

		}
		for (int i = 0; i < size; i++) {
			List<WebElement> findElements = selectedrows.get(i).findElements(By.tagName("td"));
			WebElement lastname = findElements.get(1);
			String values = lastname.getText();
			System.out.println(values);

			if (values.equals("Man")) {

				WebElement input = findElements.get(3).findElement(By.tagName("input"));
				input.click();
				break;
			}
		}
		WebElement marksheet = driver.findElement(
				By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table"));
		List<WebElement> header = marksheet.findElements(By.tagName("th"));

		for (WebElement head : header) {

			System.out.println("Header:" + head.getText());
		}
	}
}
