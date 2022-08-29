package SeleniumDay15_DependsOnMethod;

import org.testng.annotations.Test;

public class ThirdClass {

	
	@Test
	public void tc3() throws InterruptedException {
		System.out.println("Hi I am in tc3");
		Thread.sleep(5000);
	}

}
