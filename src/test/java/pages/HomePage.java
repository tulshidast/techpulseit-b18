package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {

	// Locators
	@FindBy(xpath = "//input[@name='userName']")
	WebElement userNameTextField;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextField;

	@FindBy(css = "input[name='submit']")
	WebElement submitButton;

	@FindBy(xpath = "//a[text()='Flights']")
	WebElement flightsLink;

	// Methods
	public void enterUserName(String uname) {
		userNameTextField.sendKeys(uname);
	}

	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}

	public void clickSubmitBtn() {
		submitButton.click();
	}

	public void doLogin(String uname, String password) {
		enterUserName(uname);
		enterPassword(password);
		clickSubmitBtn();
	}

	public void clickOnFlightsLink() {
		flightsLink.click();
	}

}
