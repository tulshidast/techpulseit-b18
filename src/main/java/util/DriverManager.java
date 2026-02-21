package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	private DriverManager() {
		// private constructor to prevent instantiation
	}

	public static WebDriver getDriver(String browser) {
		if (driver.get() == null) {
			WebDriver newDriver;
			switch (browser.toLowerCase()) {
			case "firefox":
				newDriver = new FirefoxDriver();
				break;
			case "edge":
				newDriver = new EdgeDriver();
				break;
			case "chrome":
			default:
				newDriver = new ChromeDriver();
				break;
			}
			driver.set(newDriver);
		}
		return driver.get();
	}

	public static void quitDriver() {
		if (driver.get() != null) {
			driver.get().quit();
			driver.remove();
		}
	}
}