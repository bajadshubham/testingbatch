package SeleniumDay18_POMClassBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddUserPageClass extends BaseClass{
	
	private WebElement textBoxUsername = driver.findElement(By.id("username"));
	private WebElement textBoxMobile = driver.findElement(By.id("mobile"));
	private WebElement textBoxEmail = driver.findElement(By.id("email"));
	private WebElement radioButtonMale = driver.findElement(By.id("Male"));
	private WebElement dropdownState = driver.findElement(By.xpath("//select[@class='form-control']"));
	private WebElement textBoxPassword = driver.findElement(By.id("password"));
	private WebElement buttonSubmit = driver.findElement(By.id("submit"));
	
	public void fillForm(String uname, String mobile,String email, String state, String pass) {
		textBoxUsername.sendKeys(uname);
		textBoxMobile.sendKeys(mobile);
		textBoxEmail.sendKeys(email);
		radioButtonMale.click();
		
		Select obj = new Select(dropdownState);
		obj.selectByVisibleText(state);
		
		textBoxPassword.sendKeys(pass);
		buttonSubmit.click();
	}

	
	
}
