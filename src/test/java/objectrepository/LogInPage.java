package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
	private WebElement MyAccountButton;
	// private By MyAccountButton =
	// By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]");
	@FindBy(css = "div.container div.nav.pull-right ul.list-inline li.dropdown.open:nth-child(2) ul.dropdown-menu.dropdown-menu-right li:nth-child(2) > a:nth-child(1)")
	private WebElement LoginButon;

	// private By LoginButon = By.cssSelector(
	// "div.container div.nav.pull-right ul.list-inline
	// li.dropdown.open:nth-child(2) ul.dropdown-menu.dropdown-menu-right
	// li:nth-child(2) > a:nth-child(1)");

	@FindBy(id = "input-email")
	private WebElement EmailIdField;

	// private By EmailIdField = By.id("input-email");

	@FindBy(id = "input-password")
	private WebElement PassWordFieLd;

	// private By PassWordFieLd = By.id("input-password");

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")

	private WebElement ClickOnLogIn;

	// private By ClickOnLogIn =
	// By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
//to use private methods we need to use getters

	public WebElement MyAccountButton() {

		return MyAccountButton;
	}

	public WebElement LoginButon() {

		return LoginButon;
	}

	public WebElement EmailIdField() {

		return EmailIdField;

	}

	public WebElement PassWordFieLd() {

		return PassWordFieLd;
	}

	public WebElement ClickOnLogIn() {

		return ClickOnLogIn;
//testing git pull
	}

}
