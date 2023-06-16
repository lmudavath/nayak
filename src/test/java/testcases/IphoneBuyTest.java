package testcases;

import org.testng.annotations.Test;

import objectrepository.IphoneBuy;

public class IphoneBuyTest extends BaseClassTest {

	IphoneBuy iphonebuy;

	@Test
	public void Search() {
		iphonebuy = new IphoneBuy(driver);
		iphonebuy.search().sendKeys("iphone");
		iphonebuy.ClickOnSearch();
	}

	@Test
	public void ClickOnSearch() {
		iphonebuy = new IphoneBuy(driver);

		iphonebuy.ClickOnSearch().click();
	}

	@Test
	public void iPhonetab() {
		iphonebuy = new IphoneBuy(driver);

		iphonebuy.iPhonetab().click();

	}

	@Test
	public void previewOfIphone() {
		iphonebuy = new IphoneBuy(driver);
		
		iphonebuy.previewOfIphone();
		
	}

	@Test
	public void clickNextButton() {
		iphonebuy = new IphoneBuy(driver);

		iphonebuy.clickNextButton().click();
		iphonebuy.clickNextButton().click();
		iphonebuy.clickNextButton().click();
		iphonebuy.clickNextButton().click();
		iphonebuy.clickNextButton().click();

	}

	@Test
	public void closePriviewbutton() {
		iphonebuy = new IphoneBuy(driver);

		iphonebuy.closePriviewbutton().click();

	}

	@Test
	public void AddToCart() {
		iphonebuy = new IphoneBuy(driver);

		iphonebuy.AddToCart().click();

	}

}
