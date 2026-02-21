package seleniumpractices;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com"); // your test site
		driver.manage().window().maximize();

		// Get all links
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of hyper links: " + links.size());

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url != null && !url.isEmpty()) {
				try {

					HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
					connection.setRequestMethod("HEAD");
					connection.connect();
					int responseCode = connection.getResponseCode();

					if (responseCode >= 400) {
						System.out.println(url + " is a broken link (Error code: " + responseCode + ")");
					} else {
						System.out.println(url + " is valid (Response code: " + responseCode + ")");
					}
				} catch (Exception e) {
					System.out.println("Exception for URL: " + url + " -> " + e.getMessage());
				}
			}
		}

		driver.quit();
	}
}
