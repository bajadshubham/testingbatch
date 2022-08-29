package SeleniumDay14_Annotations;

import org.testng.annotations.Test;

public class EnableDemo {
	
	@Test
	public void login() {
		System.out.println("Hi I am in login method");
	}
	
	@Test(enabled = false)
	public void search() {
		System.out.println("Hi I am in search method");
	}
	
	@Test
	public void logout() {
		System.out.println("Hi I am in logout method");
	}

}
