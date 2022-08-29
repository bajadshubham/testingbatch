package SeleniumDay13_TestNg;

import org.testng.annotations.Test;

public class MultipleTestCaseExecution {
	
	// by default execution order is alphabetic
	
	
	@Test(priority = 1)
	public void cmethod() {
		System.out.println("Hi I am in cmethod method");
	}
	
	@Test(priority = 2)
	public void bmethod() {
		System.out.println("Hi I am in bmethod method");
	}
	
	@Test(priority = 3)
	public void amethod() {
		System.out.println("Hi I am in amethod method");
	}

}
