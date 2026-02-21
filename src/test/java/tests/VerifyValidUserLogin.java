package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginSucessPage;

public class VerifyValidUserLogin extends BaseTest {

	@Test(description = "Verify valid user login", priority = 1, groups = { "smartcheck" }, enabled = true)
	public void verifyValidUsrLogin() {

		HomePage home = new HomePage();
		LoginSucessPage loginSucessPage = new LoginSucessPage();

		home.doLogin("Admin", "admin@123");
		String msg = loginSucessPage.getLoginSucessMsg();

		assertEquals(msg, "Login Successfully", "User login failed");

	}
}