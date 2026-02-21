package seleniumpractices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Query {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		List<WebElement> text = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("delayedText")));
		// driver.findElement(By.cssSelector("#delayedText"));

		// WebElement text1 = (WebElement)
		// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("delayedText")));

		for (WebElement elm : text) {

			System.out.println("WebElement is displyed/visible = " + elm.isDisplayed());
		}

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("drop1"))));

		System.out.println("Dropdown is visible :" + driver.findElement(By.id("drop1")).getTagName());

		driver.quit();

	}

}
