package SeleniumDay16_DataProvider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript1 {
	
	// packagename.classname.class
	@Test(retryAnalyzer = SeleniumDay16_DataProvider.RetryAnalayzeImplementation.class)
	public void tc1() {
		System.out.println("tc1");
		Assert.assertTrue(true); // 1
	}
	
	@Test(retryAnalyzer = SeleniumDay16_DataProvider.RetryAnalayzeImplementation.class)
	public void tc2() {
		System.out.println("tc2");
		Assert.assertTrue(false); // 1 + 3 = 4
	}

}
