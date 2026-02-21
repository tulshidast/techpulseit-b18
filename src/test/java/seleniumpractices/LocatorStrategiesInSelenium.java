package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStrategiesInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		// By.name
		WebElement header = driver.findElement(By.name("Header"));

		System.out.println(header.getText());

		// By.classname
		WebElement hSection = driver.findElement(By.className("title"));
		System.out.println(hSection.getText());

		// By.id
		WebElement textAreaFiled = driver.findElement(By.id("ta1"));
		textAreaFiled.sendKeys("Welcome to codedisha");

		System.out.println("######################################################");

		// By.tagname
		List<WebElement> textAreas = driver.findElements(By.tagName("textarea"));

		for (WebElement textArea : textAreas) {
			textArea.clear();
		}

		List<WebElement> hyperLinks = driver.findElements(By.tagName("a"));

		System.out.println("Number of hyper links = " + hyperLinks.size());

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		for (WebElement hyperLink : hyperLinks) {
			System.out.println(hyperLink.getAttribute("href"));
		}

		System.out.println("######################################################");

		// By.linktext
		driver.findElement(By.linkText("http://www.Selenium143.blogspot.com")).click();

		// By.partiallinktext
		WebElement pageOneLink = driver.findElement(By.partialLinkText("Page "));
		pageOneLink.click();

	}

}
