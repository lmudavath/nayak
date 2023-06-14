package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Affiliate {
	WebDriver driver;

	public Affiliate(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/h2[3]\r\n" + "")
	private WebElement affiliatee;

	@FindBy(linkText = "Register for an affiliate account")

	private WebElement register;

	public WebElement affiliatee() {

		return affiliatee;

	}

	public WebElement register() {

		return register;

	}

}
