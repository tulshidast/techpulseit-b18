package seleniumpractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement textAreaField2 = driver.findElement(By.cssSelector("textarea[cols='30']"));

		String attributeValue = textAreaField2.getAttribute("rows");

		System.out.println("Rows attribute = " + attributeValue);

		System.out.println("#########################################################");

		WebElement textDisplayedWithDelay = driver.findElement(By.cssSelector("#delayedText"));

		System.out.println("Text displayed = " + textDisplayedWithDelay.isDisplayed());

		Thread.sleep(10000);

		System.out.println("Text displayed = " + textDisplayedWithDelay.isDisplayed());

		System.out.println("#########################################################");

		// textAreaField2.getCssValue(attributeValue);

		WebElement dropdownButton = driver.findElement(By.cssSelector(".dropbtn"));

		String cssValue = dropdownButton.getCssValue("background-color");

		System.out.println(cssValue);

		System.out.println("#########################################################");

		File file = dropdownButton.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("src/test/resources/dropdown.png"));

		org.openqa.selenium.Dimension d = dropdownButton.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());

		System.out.println("#########################################################");

		String tagName = textAreaField2.getTagName();
		System.out.println("Tagname = " + tagName);

		System.out.println("#########################################################");
		System.out.println("text displayed = " + textAreaField2.getText());
		System.out.println("text displayed on dropdown = " + dropdownButton.getText());

		System.out.println("#########################################################");

		textAreaField2.clear();

		Thread.sleep(3000);

		textAreaField2.sendKeys("Welcome to codedisha");

		System.out.println("#########################################################");

		driver.findElement(By.cssSelector("input#alert1")).click();

		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		System.out.println("#########################################################");

		System.out.println("Is text area enabled = " + textAreaField2.isEnabled());

		System.out.println("Button 1 is enabled = " + driver.findElement(By.cssSelector("#but1")).isEnabled());

		System.out.println("#########################################################");

		System.out.println("Bike radio button is selected = "
				+ driver.findElement(By.cssSelector("input[value='Bike']")).isSelected());

		System.out.println("Bicycle radio button is selected = "
				+ driver.findElement(By.cssSelector("input[value='Bicycle']")).isSelected());

		System.out.println(
				"Pen checkbox is selected = " + driver.findElement(By.cssSelector("input[value='Pen']")).isSelected());

		System.out.println("Book checkbox is selected = "
				+ driver.findElement(By.cssSelector("input[value='Book']")).isSelected());

	}

}
