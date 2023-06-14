package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "body:nth-child(2) div.container:nth-child(4) ul.breadcrumb li:nth-child(2) > a:nth-child(1)")
	private WebElement Account;

//	private By Account = By
//			.cssSelector("body:nth-child(2) div.container:nth-child(4) ul.breadcrumb li:nth-child(2) > a:nth-child(1)");

	// testing
	@FindBy(css = "body:nth-child(2) div.container:nth-child(4) ul.breadcrumb li:nth-child(2) > a:nth-child(1)")
	private WebElement desktopButton;

//	private By desktopButton = By
//			.cssSelector("body:nth-child(2) div.container:nth-child(4) ul.breadcrumb li:nth-child(2) > a:nth-child(1)");

	@FindBy(css = "div.container:nth-child(3) nav.navbar div.collapse.navbar-collapse.navbar-ex1-collapse ul.nav.navbar-nav li.dropdown:nth-child(2) > a.dropdown-toggle")
	private WebElement laptopsandNotebooks;

	// private By laptopsandNotebooks = By.cssSelector(
	// "div.container:nth-child(3) nav.navbar
	// div.collapse.navbar-collapse.navbar-ex1-collapse ul.nav.navbar-nav
	// li.dropdown:nth-child(2) > a.dropdown-toggle");
	@FindBy(linkText = "Components")
	private WebElement components;
	// private By components = By.linkText("Components");
	@FindBy(css = "div.container:nth-child(3) nav.navbar div.collapse.navbar-collapse.navbar-ex1-collapse ul.nav.navbar-nav li:nth-child(4) > a:nth-child(1)")
	private WebElement tablets;
//	private By tablets = By.cssSelector(
//			"div.container:nth-child(3) nav.navbar div.collapse.navbar-collapse.navbar-ex1-collapse ul.nav.navbar-nav li:nth-child(4) > a:nth-child(1)");

	@FindBy(css = "div.container:nth-child(3) nav.navbar div.collapse.navbar-collapse.navbar-ex1-collapse ul.nav.navbar-nav li:nth-child(5) > a:nth-child(1)")
	private WebElement software;
//   private By software = By.cssSelector(
//			"div.container:nth-child(3) nav.navbar div.collapse.navbar-collapse.navbar-ex1-collapse ul.nav.navbar-nav li:nth-child(5) > a:nth-child(1)");

	@FindBy(linkText = "Phones & PDAs")

	private WebElement phonesandPdas;

	// private By phonesandPdas = By.linkText("Phones & PDAs");

	@FindBy(linkText = "Cameras")

	private WebElement cameras;

	// private By cameras = By.linkText("Cameras");

	@FindBy(linkText = "MP3 Players")
	private WebElement mp3Players;
	// private By mp3Players = By.linkText("MP3 Players");

	public WebElement Account() {

		return Account;

	}

	public WebElement desktopButton() {

		return desktopButton;
	}

	public WebElement laptopsandNotebooks() {

		return laptopsandNotebooks;
	}

	public WebElement components() {

		return components;
	}

	public WebElement tablets() {

		return tablets;

	}

	public WebElement software() {
		return software;

	}

	public WebElement phonesandPdas() {
		return phonesandPdas;

	}

	public WebElement cameras() {

		return cameras;
	}

	public WebElement mp3Players() {

		return mp3Players;
	}

}
