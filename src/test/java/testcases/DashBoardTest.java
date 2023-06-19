package testcases;

import org.testng.annotations.Test;

import listeners.Listeners;
import objectrepository.MyAccountPage;

public class DashBoardTest extends BaseClassTest {

	MyAccountPage myAccountPage;

	@Test
	public void camera() {
		myAccountPage = new MyAccountPage(driver);
		myAccountPage.cameras().click();
		Listeners.test.pass("seljsj");
		Listeners.test.fail("test case failed");
	}

}
