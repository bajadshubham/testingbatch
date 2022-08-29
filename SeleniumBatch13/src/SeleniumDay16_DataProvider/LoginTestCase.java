package SeleniumDay16_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTestCase {
	
	@Test(dataProviderClass = SeleniumDay16_DataProvider.TestScriptData.class, dataProvider = "loginTestData",retryAnalyzer = SeleniumDay16_DataProvider.RetryAnalayzeImplementation.class)
	public void verifyLogin(String uname, String pass) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html"); // use to open a application url
		
		//int x = 10;
		WebElement usernameTextBox = driver.findElement(By.id("email"));
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		usernameTextBox.sendKeys(uname); // use to enter a value
		
		passwordTextBox.sendKeys(pass); // use to enter a value
		
		loginButton.click(); // use to click on button
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
