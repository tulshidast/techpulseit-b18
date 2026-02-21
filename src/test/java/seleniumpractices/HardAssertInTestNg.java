package seleniumpractices;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertInTestNg {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
	}

	@Test
	public void verifyOmayoHomePage() {

		assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
		assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/", "Home page url is not correct");

		assertNotEquals(driver.getTitle(), "Welcome to codedisha");
		assertNotEquals(driver.getTitle(), "Welcome to codedisha", "Page title is equals to Welcome to codedisha");

		WebElement button1 = driver.findElement(By.cssSelector("#but1"));
		WebElement button2 = driver.findElement(By.cssSelector("#but2"));

		assertTrue(button2.isEnabled());
		assertTrue(button2.isEnabled(), "Button is disabled");

		assertFalse(button1.isEnabled());
		assertFalse(button1.isEnabled(), "Button1 is enabled");

		System.out.println("After assertion failure");

	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
