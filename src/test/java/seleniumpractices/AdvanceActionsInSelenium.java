package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceActionsInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions actions = new Actions(driver);

		// actions.contextClick().build().perform();

		// actions.doubleClick(driver.findElement(By.xpath("//textarea[@name='q']"))).build().perform();

//		actions.keyDown(Keys.SHIFT).keyDown(driver.findElement(By.xpath("//textarea[@name='q']")), "a")
//				.keyUp(Keys.SHIFT).keyUp("a").build().perform();

		actions.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Google apps']"))).build().perform();
		actions.sendKeys(driver.findElement(By.xpath("//textarea[@name='q']")), "iphone 16").build().perform();

		driver.navigate().to("https://omayo.blogspot.com/");

		actions.scrollToElement(driver.findElement(By.cssSelector("#alert2"))).build().perform();

		// Load a new web page in the current browser window.
		driver.navigate().to("https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.cssSelector("#droppable"));

//		actions.clickAndHold(source).pause(Duration.ofSeconds(2)).moveToElement(target).release(source).build()
//				.perform();

		actions.dragAndDrop(source, target).build().perform();

		actions.keyDown(Keys.CONTROL).keyDown(Keys.TAB).keyUp(Keys.CONTROL).keyUp(Keys.TAB).build().perform();
		
		driver.switchTo().newWindow(WindowType.TAB);

	}

}
