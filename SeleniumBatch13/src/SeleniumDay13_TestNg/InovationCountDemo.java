package SeleniumDay13_TestNg;

import org.testng.annotations.Test;

public class InovationCountDemo {

	@Test(invocationCount = 5) // We can execute single test case multiple times using invocationCount
	public void m1() {
		System.out.println("Hi I am in m1 method");
	}
	
}
