package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']"));

		List<WebElement> firstRow = table1.findElements(By.xpath("//tbody//tr[1]//td"));

		for (WebElement row : firstRow) {
			System.out.println(row.getText());
		}

		System.out.println("################################################3");

		firstRow.clear();

		firstRow = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr/td[3]"));

		for (WebElement column : firstRow) {
			System.out.println(column.getText());
		}

		System.out.println("################################################3");

		firstRow.clear();

		firstRow = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td"));

		for (WebElement column : firstRow) {
			System.out.println(column.getText());
		}

		System.out.println("################################################3");

		System.out.println(
				driver.findElement(By.xpath("//table[@id='table1']//tbody//tr//td[text()='Bangalore']")).getText());

	}

}
