package tests;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.ReservationPage;

public class VerifyFromMonthDropdownOptions extends BaseTest {

	@Test(description = "Verify from month dropdowns options", priority = 1, groups = { "smartcheck" })
	public void verifyFromMonthDropdownOptions() {

		HomePage home = new HomePage();
		ReservationPage reservationPage = new ReservationPage();

		home.clickOnFlightsLink();
		List<String> expectedOptions = Arrays.asList("January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December");

		assertEquals(reservationPage.getAllOptionsFromDropdown(), expectedOptions, "Dropdown options are not matched");

	}
}