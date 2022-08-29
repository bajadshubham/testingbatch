package SeleniumDay14_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueDemo {
	
	@Test
	public void verifyLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html"); // use to open a application url
		
		//int x = 10;
		WebElement usernameTextBox = driver.findElement(By.id("email"));
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		usernameTextBox.sendKeys("kiran@gmail.com"); // use to enter a value
		
		passwordTextBox.sendKeys("1234569"); // use to enter a value
		
		loginButton.click(); // use to click on button
		
		Assert.assertTrue(loginButton.isDisplayed());
		
		Thread.sleep(5000);
		
		driver.close();
	}


}
