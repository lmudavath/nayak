package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.Listeners;
import objectrepository.MyAccountPage;

public class LogInPageTest extends BaseClassTest {
	MyAccountPage MyAccountPage;
	
	
	@Test
	public void LogInPager() throws InterruptedException {
		MyAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(MyAccountPage.Account().isDisplayed());
		Thread.sleep(3000);
	}

	@Test
	public void desktopButto() throws InterruptedException {
		MyAccountPage = new MyAccountPage(driver);

		// is desktopButton tab enabled in the dashboard
		Assert.assertTrue(MyAccountPage.desktopButton().isDisplayed());
		Thread.sleep(3000);
	}

	@Test
	public void laptopsandNotebooks() throws InterruptedException {
		// is laptopsandNotebooks tab enabled in the dashboard
		MyAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(MyAccountPage.laptopsandNotebooks().isDisplayed());
		Thread.sleep(3000);
	}

	@Test
	public void components() throws InterruptedException {
		// is components tab enabled in the dashboard
		MyAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(MyAccountPage.components().isDisplayed());
		Thread.sleep(3000);
	}

	@Test
	public void tablets() throws InterruptedException {
		MyAccountPage = new MyAccountPage(driver);
		Listeners.test.info("edsjfhjshfskhfkshkahka");
		Listeners.test.fail("test case pass");
		Listeners.test.pass("test case pass");
		Assert.assertTrue(MyAccountPage.tablets().isDisplayed());
		Thread.sleep(3000);
	}

	@Test
	public void software() throws InterruptedException {
		MyAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(MyAccountPage.software().isDisplayed());
		Thread.sleep(3000);
	}

	@Test
	public void phonesandPdas() throws InterruptedException {
		MyAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(MyAccountPage.phonesandPdas().isDisplayed());
		Thread.sleep(3000);
	}

	@Test
	public void cameras() throws InterruptedException {
		MyAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(MyAccountPage.cameras().isDisplayed());
		Thread.sleep(3000);
	}

	@Test
	public void mp3Players() throws InterruptedException {
		MyAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(MyAccountPage.mp3Players().isDisplayed());
		Thread.sleep(3000);
	}

}
