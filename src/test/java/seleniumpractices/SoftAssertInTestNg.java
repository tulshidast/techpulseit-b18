package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertInTestNg {

	WebDriver driver;
	SoftAssert verify;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		verify = new SoftAssert();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
	}

	@Test
	public void verifyOmayoHomePage() {

		verify.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
		verify.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/", "Home page url is not correct");

		verify.assertNotEquals(driver.getTitle(), "Welcome to codedisha");
		verify.assertNotEquals(driver.getTitle(), "Welcome to codedisha",
				"Page title is equals to Welcome to codedisha");

		WebElement button1 = driver.findElement(By.cssSelector("#but1"));
		WebElement button2 = driver.findElement(By.cssSelector("#but2"));

		verify.assertTrue(button2.isEnabled());
		verify.assertTrue(button2.isEnabled(), "Button is disabled");

		verify.assertFalse(button1.isEnabled());
		verify.assertFalse(button1.isEnabled(), "Button1 is enabled");

		System.out.println("After assertion failures");

		verify.assertAll();

	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
