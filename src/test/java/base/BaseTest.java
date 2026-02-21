package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utils.Utilities;

public class BaseTest {

	protected WebDriver driver;

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void setup(String browser) {
		DriverManager.setDriver(browser);
		driver = DriverManager.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(Utilities.getProperty("url"));
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		DriverManager.quiteDriver();
	}

}
