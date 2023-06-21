package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectrepository.Affiliate;

public class AffiliateTest extends BaseClassTest {

	Affiliate affiliat;

	@Test
	public void Affiliatei() {

		affiliat = new Affiliate(driver);
		Assert.assertTrue(affiliat.affiliatee().isDisplayed());
		//testing git hub
	}

	@Test
	public void regisTer() {

		affiliat = new Affiliate(driver);
		String regtext = affiliat.register().getText();
		Assert.assertEquals(regtext, "Register for an affiliate accoun");
	}

}
