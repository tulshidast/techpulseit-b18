package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;
import utils.Utilities;

public class ReservationPage extends BasePage {

	// locators
	@FindBy(xpath = "//select[@name='fromMonth']")
	WebElement fromMonthDropdown;

	// methods
	public List<String> getAllOptionsFromDropdown() {
		return Utilities.getAllOptionsFromDropdown(fromMonthDropdown);
	}

}
