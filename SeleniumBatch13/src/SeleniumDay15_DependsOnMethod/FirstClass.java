package SeleniumDay15_DependsOnMethod;

import org.testng.annotations.Test;

public class FirstClass {
	
	@Test
	public void tc1() throws InterruptedException {
		System.out.println("Hi I am in tc1");
		Thread.sleep(5000);
	}

}
