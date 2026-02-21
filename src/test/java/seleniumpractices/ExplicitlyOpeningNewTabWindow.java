package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyOpeningNewTabWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.com");

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Welcome to google");

		driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in");

	}

}
