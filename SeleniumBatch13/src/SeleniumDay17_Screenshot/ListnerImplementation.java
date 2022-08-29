package SeleniumDay17_Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplementation extends BaseClass implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test case is failed");
		// screenshot capture
		
		String methodName = arg0.getMethod().getMethodName(); // return method name
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Selenium\\Screenshots\\"+methodName+".png");
		try {
			FileUtils.copyFile(source,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test case is skipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Test case is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test case is passed");
		
	}

}
