package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newsletter {
	WebDriver driver;

	public Newsletter(WebDriver driver) {
		this.driver = driver;
      PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/h2[4]")
	private WebElement Newsletter;
	// private By Newsletter = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/h2[4]");

	public WebElement Newslette() {

		// return driver.findElement(Newsletter);
		return Newsletter;
	}

	
	@FindBy(linkText="Subscribe / unsubscribe to newsletter")
	
	private WebElement Subscribe;
	
	//private By  Subscribe = By.linkText("Subscribe / unsubscribe to newsletter");

	public WebElement Subscribe() {

		return Subscribe;

	}

}
