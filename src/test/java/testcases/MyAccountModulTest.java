package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.Listeners;
import objectrepository.MyAccountModule;

public class MyAccountModulTest extends BaseClassTest {
	MyAccountModule myaccount;

	@Test
	public void MyAccountModuleTest() {
		myaccount = new MyAccountModule(driver);
		Assert.assertTrue(myaccount.password().isDisplayed());
		String text = myaccount.password().getText();
		Assert.assertEquals(text, "Change your password");
		
	}

	@Test
	public void editinformation() {
		myaccount = new MyAccountModule(driver);
		Assert.assertTrue(myaccount.editinformation().isDisplayed());
		Listeners.test.pass("redirectingtoeditinformationtab");
		String str = myaccount.editinformation().getText();
		Assert.assertEquals(str, "Modify your address book entries");
	}

	@Test
	public void addressbook() {
		myaccount = new MyAccountModule(driver);
		Assert.assertTrue(myaccount.addressbook().isDisplayed());
		String rtr = myaccount.addressbook().getText();
		Assert.assertEquals(rtr, "Modify your address book entries");
		//testing
	}

	@Test
	public void wishlist() {
		myaccount = new MyAccountModule(driver);
		Assert.assertTrue(myaccount.wishlist().isDisplayed());
		String rtt = myaccount.wishlist().getText();
		Assert.assertEquals(rtt, "Modify your wish list");
	}

}
