package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {

	WebDriver driver;
	SoftAssert verify;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		verify = new SoftAssert();

		driver.get("https://demo.guru99.com/test/newtours/index.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@Test(description = "Verify user login", dataProvider = "uData")
	public void verifyUserLogin(String uname, String pass, String msg) {

//		if (uname.equals("user2")) {
//			throw new TestSkippedException();
//		}

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		String loginSucessMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();

		verify.assertEquals(loginSucessMsg, msg);
		verify.assertAll();
	}

	@DataProvider(name = "uData")
	public String[][] dataProvider() {
		String[][] userData = { { "admin", "admin@123", "Login Successfully" },
				{ "user", "user@123", "Login Successfully" }, { "user2", "user2@123", "Login Successfully" } };
		return userData;
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
