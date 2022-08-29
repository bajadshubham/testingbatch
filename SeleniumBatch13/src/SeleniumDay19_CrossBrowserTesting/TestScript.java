package SeleniumDay19_CrossBrowserTesting;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {

	@Test
	public void verifyLogin() throws InterruptedException, IOException {
		
		log = Logger.getLogger(TestScript.class); // classname.class

		WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

		emailTextBox.sendKeys(prop.getProperty("username")); // use to enter a value
		log.info("User entered username.");
		
		passwordTextBox.sendKeys(prop.getProperty("password")); // use to enter a value
		log.info("User entered password.");

		submitButton.click(); // use to click on button
		log.info("User click on submit button.");
		
		Assert.assertTrue(true);
		log.info("User redirected to dashboard page.");

		Thread.sleep(5000);
		
		String textValue = driver.findElement(By.xpath("//span[text()='Dashboard']")).getText();
		prop.setProperty("dashboardvalue",textValue);
		prop.store(output, "File Updated");
		
		
		driver.close();
		log.info("User closed a browser.");

	}

}
