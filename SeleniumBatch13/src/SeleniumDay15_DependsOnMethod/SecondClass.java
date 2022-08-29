package SeleniumDay15_DependsOnMethod;

import org.testng.annotations.Test;

public class SecondClass {
	
	@Test
	public void tc2() throws InterruptedException {
		System.out.println("Hi I am in tc2");
		Thread.sleep(5000);
	}


}
