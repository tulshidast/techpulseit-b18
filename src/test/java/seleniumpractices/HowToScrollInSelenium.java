package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToScrollInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 600);");

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0, -300);");

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(100, 0);");

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(-100, 0);");

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(100, -300);");

		js.executeScript("window.scrollBy(-100, 0);");

		Thread.sleep(3000);

		js.executeScript("window.scrollTo(document.body.scrollWidth, document.body.scrollHeight)");

		Thread.sleep(3000);

		WebElement textArea = driver.findElement(By.xpath("//textarea[@id='ta1']"));

		js.executeScript("arguments[0].scrollIntoView(true);", textArea);

		js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("#checkbox2")));

	}

}
