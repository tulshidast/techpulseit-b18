package seleniumpractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.DriverManager;

public class TestNgPriority {

	WebDriver driver;
	SoftAssert verify;

	@BeforeMethod(alwaysRun = true)
	public void setup() {

		driver = DriverManager.getDriver("chrome");
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	}

	@Test(description = "Verify omayo home page details", priority = -5)
	public void verifyOmayoHomePageDetails() {

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

		List<String> expectedOptionsFromDropdown = Arrays.asList("Older Newsletters", "doc 1", "doc 2", "doc 3",
				"doc 4");

		verify.assertEquals(allOptionsText, expectedOptionsFromDropdown);

		verify.assertAll();

	}

	@Test(description = "Verify omayo home page title", priority = -4)
	public void verifyHomePageTitle() {

		verify.assertEquals(driver.getTitle(), "omayo (QAFox.com)", "Title not matched");

		verify.assertAll();

	}

	@Test(description = "Verify omayo home page url", priority = -3)
	public void verifyHomePageUrl() {

		verify.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/", "Home page url is incorrect");

		verify.assertAll();

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		DriverManager.quitDriver();
	}

}
