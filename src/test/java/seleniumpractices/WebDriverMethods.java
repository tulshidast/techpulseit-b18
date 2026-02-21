package seleniumpractices;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Load a new web page in the current browser window.
		driver.get("https://omayo.blogspot.com/");

		WebElement textArea = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		System.out.println(textArea.getAttribute("id"));

		List<WebElement> hyperLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Number of links on the page = " + hyperLinks.size());

		System.out.println("####################################");

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url = " + currentUrl);

		System.out.println("##################################### \n \n");

		String pageSource = driver.getPageSource();
		// System.out.println(pageSource);

		System.out.println("####################################");

		String pageTitle = driver.getTitle();
		System.out.println("Webpage title = " + pageTitle);

		System.out.println("####################################");

		String handle = driver.getWindowHandle();

		System.out.println("Windle handle = " + handle);

		System.out.println("####################################");

		Set<String> windowHandles = driver.getWindowHandles();

		System.out.println("Number of windows/tabs = " + windowHandles.size());

		System.out.println("####################################");

		driver.navigate().to("https://www.amazon.in/");

		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().refresh();

		driver.switchTo().newWindow(WindowType.WINDOW).navigate().to("https://omayo.blogspot.com/");

		driver.close();

		Thread.sleep(3000);

		driver.quit();

	}

}
