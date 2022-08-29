package SeleniumDay15_DependsOnMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {

	
	@Test
	public void verifyLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		SoftAssert obj = new SoftAssert();
		
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/index.html"); // use to open a application url
		
		//int x = 10;
		WebElement usernameTextBox = driver.findElement(By.id("email"));
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		usernameTextBox.sendKeys("kiran@gmail.com"); // use to enter a value
		
		passwordTextBox.sendKeys("123456"); // use to enter a value
		
		loginButton.click(); // use to click on button
		
		obj.assertEquals(driver.getCurrentUrl(), "file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard12.html");
		
		System.out.println("Hi..");
		
		Thread.sleep(5000);
		
		driver.close();
		
		obj.assertAll();
	}
	
}
