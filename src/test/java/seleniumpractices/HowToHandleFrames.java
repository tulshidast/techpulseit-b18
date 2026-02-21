package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleFrames {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.cssSelector("#navbar-iframe"));

		// driver.switchTo().frame(0);

		// driver.switchTo().frame("navbar-iframe");

		driver.switchTo().frame(frame);

		WebElement dropdown = driver.findElement(By.xpath("//select[@aria-label='More options']"));

		Select select = new Select(dropdown);

		select.selectByVisibleText("Share by email");

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Welcome to codedisha");

	}

}
