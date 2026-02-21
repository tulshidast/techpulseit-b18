package seleniumpractices;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleMultipleWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.findElement(By.cssSelector("#selenium143")).click();

		String currentlyFocusedWindowHandle = driver.getWindowHandle();

		Set<String> windowsHandles = driver.getWindowHandles();

		for (String handle : windowsHandles) {
			if (!(handle.equals(currentlyFocusedWindowHandle))) {

				driver.switchTo().window(handle);

				break;

			}
		}

		WebElement whatIsSeleniumLink = driver.findElement(By.xpath("//a[text()='What is Selenium?']"));

		System.out.println("href Attribute = " + whatIsSeleniumLink.getAttribute("href"));

		driver.close();

		driver.switchTo().window(currentlyFocusedWindowHandle);

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Welcome to codedisha");

		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();

		windowsHandles.clear();

		windowsHandles = driver.getWindowHandles();

		for (String handle : windowsHandles) {
			if (!(handle.equals(currentlyFocusedWindowHandle))) {

				driver.switchTo().window(handle);

				break;

			}
		}

		driver.manage().window().maximize();

		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());

		driver.close();

		driver.switchTo().window(currentlyFocusedWindowHandle);

		driver.findElement(By.cssSelector("#ta1")).clear();

		driver.quit();

	}

}
