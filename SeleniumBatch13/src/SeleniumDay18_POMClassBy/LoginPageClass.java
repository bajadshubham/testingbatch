package SeleniumDay18_POMClassBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageClass extends BaseClass{

	private WebElement emailTextBox = driver.findElement(By.id("email"));
	private WebElement passwordTextBox = driver.findElement(By.id("password"));
	private WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
	public void login(String username, String password) {
		emailTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		submitButton.click();
	}
 	

}
