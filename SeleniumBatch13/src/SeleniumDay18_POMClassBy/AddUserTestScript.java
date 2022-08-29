package SeleniumDay18_POMClassBy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddUserTestScript extends BaseClass{
	
	@Test
	public void verifyAddUser() {
		
		LoginPageClass loginPageCLassObj  = new LoginPageClass();
		
		loginPageCLassObj.login("kiran@gmail.com", "123456");
		
		DashboardPageClass DashboardPageClassObj = new DashboardPageClass();
		
		Assert.assertTrue(DashboardPageClassObj.verifyDashboardTab());
		
		DashboardPageClassObj.clickOnUserTab();
		
		UserPageClass UserPageClassObj = new UserPageClass();
		
		Assert.assertTrue(UserPageClassObj.verifyAddUserButton());
		
		UserPageClassObj.clickOnAddUserButton();
		
		AddUserPageClass AddUserPageClassObj = new AddUserPageClass();
		
		AddUserPageClassObj.fillForm("rintu", "9988776655", "rintu@test.com", "HP", "1234");
	}

}
