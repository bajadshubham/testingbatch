package SeleniumDay15_DependsOnMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {
	
	@Test
	public void Login() {
		System.out.println("I am in login method");
		Assert.assertTrue(false); // fail
	}
	
	@Test(dependsOnMethods = {"Login"})
	public void profileSection() {
		System.out.println("I am in profileSection method");
	}
	
	@Test(dependsOnMethods = {"Login"})
	public void Logout() {
		System.out.println("I am in Logout method");
	}
	
	@Test(dependsOnMethods = {"Login"}, alwaysRun = true)
	public void DMethod() {
		System.out.println("I am in DMethod method");
	}

}
