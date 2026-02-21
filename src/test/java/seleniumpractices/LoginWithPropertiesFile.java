package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Utilities;

public class LoginWithPropertiesFile {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get(Utilities.getProperty("url"));

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(Utilities.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Utilities.getProperty("password"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

}
