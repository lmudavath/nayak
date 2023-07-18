package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import extentreport.ExtentReport;
import testcases.BaseClassTest;

public class Listeners extends BaseClassTest implements ITestListener {

	public static ExtentTest test;

	ExtentReports extent = ExtentReport.getReportObject();

	// ExtentReports extent =ExtentReports.getReportObject();
	// ExtentReports extent = ExtentReport.getReportObject();
	ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getMethod().getMethodName());
		extentTestThread.set(test);

	}

	public void onTestSucess(ITestResult Results) {

		// test.log(Status.PASS, Results.getMethod().getMethodName());

		extentTestThread.get().log(Status.PASS, Results.getMethod().getMethodName());

	}

//initially Test text is not there i only added
	public void onTestFailure(ITestResult result) {

//		test.log(Status.FAIL, result.getMethod().getMethodName());
//		test.fail(result.getThrowable());
		// extentTestThread.get().log(Status.FAIL, result.getMethod().getMethodName());

		extentTestThread.get().log(Status.FAIL, result.getMethod().getMethodName());
		extentTestThread.get().fail(result.getThrowable());


//
		String testMethodName = result.getMethod().getMethodName();
		WebDriver driver = null;

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver")
					.get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (driver != null) {
			try {
				File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String destinationFilePath = System.getProperty("user.dir") + "\\screenshots\\" + testMethodName
						+ ".png";
				FileUtils.copyFile(sourceFile, new File(destinationFilePath));
				//below line is for add screen shot to the extend report
				extentTestThread.get().addScreenCaptureFromPath(destinationFilePath, testMethodName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

			System.out.println("Driver object is null. Unable to take a screenshot.");
		}

	}

	public void onFinish(ITestContext Context) {

		extent.flush();

	}

}
