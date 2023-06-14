package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountModule {

	WebDriver driver;

	public MyAccountModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "div.container:nth-child(4) div.row div.col-sm-9 ul.list-unstyled:nth-child(2) li:nth-child(1) > a:nth-child(1)")
	private WebElement editinformation;
	// private By editinformation = By.cssSelector(
	// "div.container:nth-child(4) div.row div.col-sm-9
	// ul.list-unstyled:nth-child(2) li:nth-child(1) > a:nth-child(1)");
	@FindBy(css = "div.container:nth-child(4) div.row div.col-sm-9 ul.list-unstyled:nth-child(2) li:nth-child(2) > a:nth-child(1)")
	private WebElement password;
//	private By password = By.cssSelector(
//			"div.container:nth-child(4) div.row div.col-sm-9 ul.list-unstyled:nth-child(2) li:nth-child(2) > a:nth-child(1)");

	@FindBy(linkText = "Modify your address book entries")
	private WebElement addressbook;
	// private By addressbook = By.linkText("Modify your address book entries");

	@FindBy(linkText = "Modify your wish list")

	private WebElement wishlist;

	// private By wishlist = By.linkText("Modify your wish list");

	public WebElement editinformation() {
		return editinformation;
	}

	public WebElement password() {
		return password;
	}

	public WebElement addressbook() {
		return addressbook;

		// return driver.findElement(addressbook);
	}

	public WebElement wishlist() {
		return wishlist;

		// return driver.findElement(wishlist);
	}

}
