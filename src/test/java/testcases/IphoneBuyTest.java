package testcases;

import org.testng.annotations.Test;

import objectrepository.IphoneBuy;

public class IphoneBuyTest extends BaseClassTest {

	IphoneBuy iphonebuy;

	@Test(priority = 1)
	public void Search() throws InterruptedException {
		iphonebuy = new IphoneBuy(driver);
		iphonebuy.search().sendKeys("iphone");
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void ClickOnSearch() throws InterruptedException {
		iphonebuy = new IphoneBuy(driver);
		iphonebuy.ClickOnSearch().click();
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void iPhonetab() throws InterruptedException {
		iphonebuy = new IphoneBuy(driver);
		iphonebuy.iPhonetab().click();
		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void previewOfIphone() throws InterruptedException {
		iphonebuy = new IphoneBuy(driver);
		iphonebuy.previewOfIphone().click();
		Thread.sleep(3000);

	}

	@Test(priority = 5)
	public void clickNextButton() throws InterruptedException {
		iphonebuy = new IphoneBuy(driver);
		iphonebuy.clickNextButton().click();
		Thread.sleep(2000);
		iphonebuy.clickNextButton().click();
		Thread.sleep(2000);
		iphonebuy.clickNextButton().click();
		Thread.sleep(2000);
		iphonebuy.clickNextButton().click();
		Thread.sleep(2000);
		iphonebuy.clickNextButton().click();
		Thread.sleep(2000);

	}

	@Test(priority = 6)
	public void closePriviewbutton() throws InterruptedException {
		iphonebuy = new IphoneBuy(driver);
		iphonebuy.closePriviewbutton().click();
		Thread.sleep(3000);

	}

	@Test(priority = 7)
	public void AddToCart() throws InterruptedException {
		iphonebuy = new IphoneBuy(driver);
		iphonebuy.AddToCart().click();
		Thread.sleep(2000);

	}

	@Test(priority = 8)
	public void cart() throws InterruptedException {
		iphonebuy = new IphoneBuy(driver);
		iphonebuy.cart().click();
		Thread.sleep(2000);

	}

	@Test(priority = 9)
	public void buyProduct() throws InterruptedException {

		iphonebuy = new IphoneBuy(driver);
		iphonebuy.buyProduct().click();
		Thread.sleep(2000);

	}

}
