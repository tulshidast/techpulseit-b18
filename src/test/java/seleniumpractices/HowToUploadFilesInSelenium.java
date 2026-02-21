package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToUploadFilesInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement fileUploader = driver.findElement(By.cssSelector("#uploadfile"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", fileUploader);

		fileUploader.sendKeys(
				"C:\\Users\\Admin\\eclipse-workspace\\com.codedisha.b18\\src\\test\\java\\seleniumpractices\\DropdownCommingUnderSelectTagMultiSelection.java");

	}

}
