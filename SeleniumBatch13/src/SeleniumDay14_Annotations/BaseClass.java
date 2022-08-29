package SeleniumDay14_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Hi I am in before class");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Hi I am in after class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Hi i am in before method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("Hi i am in after method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Hi i am in Before test");
		// database connection on
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Hi i am in after test");
		// database connection off
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Hi i am in before suite");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("Hi i am in after suite");
	}
	
	
}
