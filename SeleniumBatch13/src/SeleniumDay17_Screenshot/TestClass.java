package SeleniumDay17_Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
	
	@Test
	public void verifyLogin() throws InterruptedException {
	WebElement usernameTextBox = driver.findElement(By.id("email"));
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		usernameTextBox.sendKeys("kiran@gmail.com"); // use to enter a value
		
		passwordTextBox.sendKeys("123456"); // use to enter a value
		
		loginButton.click(); // use to click on button
		
		Assert.assertTrue(false);
		
		Thread.sleep(5000);
		
		driver.close();
	}
	
	@Test
	public void verifyAddUser() {
		driver.findElement(By.xpath("//span[text()='Users']")).click();
	}

}
