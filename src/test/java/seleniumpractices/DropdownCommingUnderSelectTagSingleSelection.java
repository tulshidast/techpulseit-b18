package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownCommingUnderSelectTagSingleSelection {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement singleSelectionDropdown = driver.findElement(By.cssSelector("select#drop1"));

		Select select = new Select(singleSelectionDropdown);

		// deselect related methods will not work on single selection dropdown
		// if we call deselect related method it will throw
		// java.lang.UnsupportedOperationException
		// select.deselectAll();

		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		for (WebElement selectedOption : allSelectedOptions) {
			System.out.println(selectedOption.getText());
		}

		System.out.println("######################################################");

		WebElement firstSelectedOption = select.getFirstSelectedOption();

		System.out.println("First selected option = " + firstSelectedOption.getText());

		System.out.println("######################################################");

		List<WebElement> allOptionsFromDropdown = select.getOptions();

		for (WebElement opt : allOptionsFromDropdown) {
			System.out.println(opt.getText());
		}

		System.out.println("######################################################");

		System.out.println("Is multi selection allowed = " + select.isMultiple());

		System.out.println("######################################################");

		select.selectByContainsVisibleText("4");

		Thread.sleep(3000);

		select.selectByIndex(3);

		Thread.sleep(3000);

		select.selectByValue("def");

		Thread.sleep(3000);

		select.selectByVisibleText("Older Newsletters");
	}

}
