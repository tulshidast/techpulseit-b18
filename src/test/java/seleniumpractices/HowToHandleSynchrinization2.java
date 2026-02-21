package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleSynchrinization2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement text = driver.findElement(By.cssSelector("#delayedText"));

		System.out.println("WebElement is displyed/visible = " + text.isDisplayed());

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

		wait.withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class)
				.pollingEvery(Duration.ofMillis(100));

		wait.until(ExpectedConditions.visibilityOf(text));

		System.out.println("WebElement is displyed/visible = " + text.isDisplayed());

		driver.findElement(By.xpath("//button[text()='Check this']")).click();

		WebElement mrCheckbox = driver.findElement(By.cssSelector("input#dte"));

		System.out.println("checkbox is enabled = " + mrCheckbox.isEnabled());

		wait.until(ExpectedConditions.elementToBeClickable(mrCheckbox));

		System.out.println("checkbox is enabled = " + mrCheckbox.isEnabled());

	}

}
