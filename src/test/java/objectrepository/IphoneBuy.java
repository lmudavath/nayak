package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IphoneBuy {

	WebDriver driver;

	public IphoneBuy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "search")
	private WebElement Search;

	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]/i[1]")
	private WebElement ClickOnSearch;

	@FindBy(xpath = "//body/div[@id='product-search']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement iPhonetab;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	private WebElement previewOfIphone;

	@FindBy(xpath = "//body/div[2]/div[1]/button[2]")
	private WebElement clickNextButton;

	@FindBy(xpath = "//button[contains(text(),'×')]")
	private WebElement closePriviewbutton;

	@FindBy(tagName = "button")
	private WebElement AddToCart;

	@FindBy(id = "cart-total")
	private WebElement cart;

	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]")
	private WebElement buyProduct;

	public WebElement search() {

		return Search;
	}

	public WebElement ClickOnSearch() {

		return ClickOnSearch;

	}

	public WebElement iPhonetab() {

		return iPhonetab;

	}

	public WebElement previewOfIphone() {

		return previewOfIphone;

	}

	public WebElement clickNextButton() {

		return clickNextButton;

	}

	public WebElement closePriviewbutton() {

		return closePriviewbutton;
	}

	public WebElement AddToCart() {

		return AddToCart;

	}

	public WebElement cart() {

		return cart;
	}

	public WebElement buyProduct() {

		return buyProduct;

	}

}
