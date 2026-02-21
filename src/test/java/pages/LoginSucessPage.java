package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LoginSucessPage extends BasePage {

	// locator
	@FindBy(xpath = "//h3[text()='Login Successfully']")
	WebElement loginSucessMsg;

	// methods
	public String getLoginSucessMsg() {
		return loginSucessMsg.getText();
	}

}
