package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Utilities;

public class TestNgTestCase {

	@Test
	public void verifyPageTitle() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get(Utilities.getProperty("url"));

		driver.manage().window().maximize();

		String title = driver.getTitle();

		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}

}
