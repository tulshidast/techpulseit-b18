package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleSynchrinizationUsingExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Welcome tocodedisha");

		driver.findElement(By.xpath("//input[@id='sachin tendulkar']"));

	}

}
