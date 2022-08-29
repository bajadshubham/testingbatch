package SeleniumDay15_DependsOnMethod;

import org.testng.annotations.Test;

public class GroupingDemo {
	
	@Test(groups = {"smoke"})
	public void tc1() {
		System.out.println("Hi I am in tc1");
	}
	
	@Test(groups = {"sanity"})
	public void tc2() {
		System.out.println("Hi I am in tc2");
	}
	
	@Test(groups = {"smoke","sanity","regression"})
	public void tc3() {
		System.out.println("Hi I am in tc3");
	}

}
