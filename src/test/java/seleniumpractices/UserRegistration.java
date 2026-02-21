package seleniumpractices;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Utilities;

public class UserRegistration {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get(Utilities.getProperty("url"));

		driver.manage().window().maximize();

		Map<Integer, ArrayList<Object>> userData = Utilities.readCompleteExcelData("urdata");

		Set<Entry<Integer, ArrayList<Object>>> ent = userData.entrySet();

		Iterator<Entry<Integer, ArrayList<Object>>> itr = ent.iterator();

		while (itr.hasNext()) {
			Entry<Integer, ArrayList<Object>> ee = itr.next();
			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

//		System.out.println(userData.get(1));
//		System.out.println(userData.get(2));

//		ArrayList<Object> alist = Utilities.readExcelData("urdata");
//
//		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
//
//		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(alist.get(0).toString());
//		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(alist.get(1).toString());
//		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(alist.get(2).toString());
//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(alist.get(3).toString());

	}

}
