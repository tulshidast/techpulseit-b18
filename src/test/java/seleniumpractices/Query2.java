package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Query2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement text = driver.findElement(By.cssSelector("#delayedText"));

		System.out.println(text.getAttribute("style"));
		System.out.println(text.getAttribute("visible"));
		System.out.println(text.getAttribute("visibility"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.visibilityOf(text));
		wait.until(ExpectedConditions.attributeContains(text, "style", "visibility: visible;"));

		System.out.println(text.getAttribute("style"));
		System.out.println(text.getAttribute("visible"));
		System.out.println(text.getAttribute("visibility"));

	}

}
