package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownCommingUnderSelectTagMultiSelection {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement multiSelectionDropdown = driver.findElement(By.cssSelector("select#multiselect1"));

		Select select = new Select(multiSelectionDropdown);

		select.selectByContainsVisibleText("Aud");

		select.selectByIndex(0);

		select.selectByValue("Hyundaix");

		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		for (WebElement opt : allSelectedOptions) {
			System.out.println(opt.getText());
		}

		System.out.println("##################################################");

		WebElement firstSelectedOption = select.getFirstSelectedOption();

		System.out.println("First selected option = " + firstSelectedOption.getText());

		System.out.println("##################################################");

		List<WebElement> allOptions = select.getOptions();
		for (WebElement opt : allOptions) {
			System.out.println(opt.getText());
		}

		System.out.println("##################################################");

		System.out.println("Multi select allowed = " + select.isMultiple());

		System.out.println("##################################################");

		select.deselectAll();

		Thread.sleep(3000);

		select.selectByContainsVisibleText("Aud");

		select.selectByIndex(0);

		select.selectByValue("Hyundaix");

		select.selectByVisibleText("Swift");

		Thread.sleep(3000);

		select.deSelectByContainsVisibleText("Aud");
		Thread.sleep(3000);

		select.deselectByIndex(0);
		Thread.sleep(3000);

		select.deselectByValue("Hyundaix");
		Thread.sleep(3000);

		select.deselectByVisibleText("Swift");

	}

}
