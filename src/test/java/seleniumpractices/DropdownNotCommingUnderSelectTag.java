package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownNotCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		DropdownNotCommingUnderSelectTag.selectOptionFromDropdown(driver, "flipkart");

//		driver.findElement(By.cssSelector(".dropbtn")).click();
//
//		Thread.sleep(10000);
//
//		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id='myDropdown']/a"));
//
//		for (WebElement option : allOptions) {
//			if (option.getText().equals("Flipkart")) {
//				option.click();
//				break;
//			}
//		}

	}

	public static void selectOptionFromDropdown(WebDriver driver, String optionToSelect) throws InterruptedException {
		driver.findElement(By.cssSelector(".dropbtn")).click();

		Thread.sleep(10000);

		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id='myDropdown']/a"));

		for (WebElement option : allOptions) {
			if (option.getText().equalsIgnoreCase(optionToSelect)) {
				option.click();
				break;
			}
		}
	}

}
