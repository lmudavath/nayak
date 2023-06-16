package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectrepository.MyOrders;

public class MyOrdersTest extends BaseClassTest {

	MyOrders myorder;

	@Test
	public void MyOrder() {
		myorder = new MyOrders(driver);
		Assert.assertTrue(myorder.myOrder().isDisplayed());
	}

	@Test
	public void viewyourorderhis() {
		myorder = new MyOrders(driver);
		Assert.assertTrue(myorder.viewyourorderhist().isDisplayed());

	}

	@Test
	public void download() {
		myorder = new MyOrders(driver);
		Assert.assertTrue(myorder.downloads().isDisplayed());

	}

	@Test
	public void yourRewardPoint() {
		myorder = new MyOrders(driver);

		Assert.assertTrue(myorder.yourRewardPoints().isDisplayed());

	}

	@Test
	public void yourTransactions() {
		myorder = new MyOrders(driver);

		Assert.assertTrue(myorder.yourTransactions().isDisplayed());

	}

	@Test
	public void recurringPayment() {

		myorder = new MyOrders(driver);

		Assert.assertTrue(myorder.recurringPayments().isDisplayed());

	}

	@Test
	public void viewYourReturnRequest() {
		myorder = new MyOrders(driver);
		
		Assert.assertTrue(myorder.viewYourReturnRequests().isDisplayed());

	}

	@Test
	public void viewYourReturnReque() {
		myorder = new MyOrders(driver);

		String textcheck = myorder.viewYourReturnRequests().getText();

		Assert.assertEquals(textcheck, "viewYourReturnRequest");
		
	

	}

}
