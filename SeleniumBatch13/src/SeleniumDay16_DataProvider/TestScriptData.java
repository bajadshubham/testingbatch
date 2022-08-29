package SeleniumDay16_DataProvider;

import org.testng.annotations.DataProvider;

public class TestScriptData {
	
	@DataProvider(name="loginTestData")
	public static Object[][] testData(){
		Object[][] x = {{"kiran@gmail.com","123456"},{"","123456"},{"kiran@gmail.com",""},{"kiran","1233"}};
		return x;
	}
	
	@DataProvider(name="addUserTestData")
	public static Object[][] testData1(){
		Object[][] x = {{"kiran@gmail.com","123456","rintu@gmail.com","1234","Maharashtra"}};
		return x;
	}
	
//	@DataProvider(name="testdata")
//	public static Object[][] alldatatest(){
//		// read data from excel
//		
//	}

}
