package SeleniumDay16_DataProvider;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalayzeImplementation implements IRetryAnalyzer{
	
	int counter = 0;
	int retryLimit = 3;

	@Override
	public boolean retry(ITestResult arg0) { // listen result - fail
		if(counter < retryLimit) { // 3<3
			counter++ ; // 3
			return true; // re-execution
		}
		return false; // no need to perform re-execution
	}

}
