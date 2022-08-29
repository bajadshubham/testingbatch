package SeleniumDay18_POMClassBy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseClass{
	
	public LoginPageClass loginPageCLassObj;
	public DashboardPageClass DashboardPageClassObj;
	
	@Test
	public void verifyLogin() {
		
		loginPageCLassObj  = new LoginPageClass();
		
		
		
		loginPageCLassObj.login("kiran@gmail.com", "123456");
		
		DashboardPageClassObj = new DashboardPageClass();
		
		Assert.assertTrue(DashboardPageClassObj.verifyDashboardTab());
	}

}
