package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import objectrepository.LogInPage;
import resources.Basee;

public class BaseClassTest extends Basee {
	public WebDriver driver;

	@BeforeClass
	public void openweb() throws IOException {
		driver = initializeBrowser();
		driver.get("https://tutorialsninja.com/demo/");
		LogInPage LogInPage = new LogInPage(driver);
		LogInPage.MyAccountButton().click();
		LogInPage.LoginButon().click();
		LogInPage.EmailIdField().sendKeys("limbya@gmail.com");
		LogInPage.PassWordFieLd().sendKeys("Kabeer@123");
		LogInPage.ClickOnLogIn().click();
	}

	@AfterClass
	public void close() {

		driver.quit();
	}

}