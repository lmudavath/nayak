package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrders {

	WebDriver driver;

	public MyOrders(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/h2[2]")
	private WebElement myOrder;

	@FindBy(partialLinkText = "View your order hist")

	private WebElement viewyourorderhist;

	@FindBy(linkText = "Downloads")
	private WebElement downloads;

	@FindBy(linkText = "Your Reward Points")

	private WebElement yourRewardPoints;

	@FindBy(linkText = "View your return requests")
	private WebElement viewYourReturnRequests;

	@FindBy(linkText = "Your Transactions")
	private WebElement yourTransactions;

	@FindBy(linkText = "Recurring payments")

	private WebElement recurringPayments;

	public WebElement myOrder() {

		return myOrder;

	}

	public WebElement viewyourorderhist() {

		return viewyourorderhist;

	}

	public WebElement downloads() {
		

		return downloads;
	}

	public WebElement yourRewardPoints() {

		return yourRewardPoints;
	}

	public WebElement viewYourReturnRequests() {

		return viewYourReturnRequests;

	}

	public WebElement yourTransactions() {

		return yourTransactions;

	}

	public WebElement recurringPayments() {

		return recurringPayments;

	}
	
}

