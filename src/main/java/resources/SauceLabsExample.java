package resources;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsExample {

	public static final String USERNAME = "oauth-limbyanayak1950-2672b";
	public static final String ACCESS_KEY = "0d29a9dd-cdfa-4ba0-a7ac-92a7e1ea093d";
	public static final String SAUCE_URL = "https://oauth-limbyanayak1950-2672b:0d29a9dd-cdfa-4ba0-a7ac-92a7e1ea093d@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("browserVersion", "latest");
		capabilities.setCapability("platformName", "Windows 8");

		URL url = new URL(SAUCE_URL);
		RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);

		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(4000);

		// driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("iphone");
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")).click();
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);

	}
}
