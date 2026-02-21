package seleniumpractices;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Utilities;

public class TakesScreenshotOnFailure {

	@BeforeSuite(alwaysRun = true)
	public void cleanUp() {
		File directory = new File("src/test/resources/screenshoot");

		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) { // ensures only files are deleted
					if (file.delete()) {
						System.out.println(file.getName() + " deleted successfully");
					} else {
						System.out.println("Failed to delete " + file.getName());
					}
				}
			}
		}

	}

	WebDriver driver;

	SoftAssert verify;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		verify = new SoftAssert();
	}

	@Test(description = "Verify omayo home page details", priority = 0)
	public void verifyOmayoHomePageDetails() {

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		String RadiButtonsLabel = driver.findElement(By.xpath("//input[@id='radio1']/..")).getText();

		System.out.println(RadiButtonsLabel);

		verify.assertTrue(RadiButtonsLabel.contains("Male"));

		String attributeValue = driver.findElement(By.xpath("//input[@id='checkbox1']")).getAttribute("value");

		System.out.println(attributeValue);
		verify.assertEquals(attributeValue, "orange", "Checkbox1 value attribute is incorrect");

		Select select = new Select(driver.findElement(By.cssSelector("#drop1")));

		String firstSelectedOption = select.getFirstSelectedOption().getText();
		verify.assertEquals(firstSelectedOption, "Older Newsletters");

		System.out.println(firstSelectedOption);

		List<WebElement> allOptions = select.getOptions();

		ArrayList<String> allOptionsText = new ArrayList<>();

		for (WebElement elm : allOptions) {
			allOptionsText.add(elm.getText());
		}

		System.out.println(allOptionsText);

		List<String> expectedOptionsFromDropdown = Arrays.asList("Older Newsletters", "doc 10", "doc 2", "doc 3",
				"doc 4");

		verify.assertEquals(allOptionsText, expectedOptionsFromDropdown);

		verify.assertAll();

		driver.quit();

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			Utilities.getScreenshot(driver, result.getMethod().getMethodName());
		}

		if (driver != null) {
			driver.quit();
		}
	}

}
