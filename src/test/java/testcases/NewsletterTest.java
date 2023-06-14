package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectrepository.Newsletter;

public class NewsletterTest extends BaseClassTest {
	
	@Test
	public void newsletter() {
		Newsletter text = new Newsletter(driver);
		Assert.assertTrue(text.Newslette().isDisplayed());

	}

	@Test
	public void subscribeUnsuscribe() {

		Newsletter subscribe = new Newsletter(driver);
		Assert.assertTrue(subscribe.Subscribe().isDisplayed());

	}

	@Test
	public void unsuscribe() {
		Newsletter unsubscribeText = new Newsletter(driver);

		String unsub = unsubscribeText.Subscribe().getText();

		Assert.assertEquals(unsub, "Subscribe / unsubscribe to newslette");

	}

	@Test
	public void subscribeclick() throws InterruptedException {
		Newsletter unsubscribeTex = new Newsletter(driver);
		unsubscribeTex.Subscribe().click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

}
