package SeleniumDay18_POMClassBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserPageClass extends BaseClass{
	
	private WebElement buttonAddUser = driver.findElement(By.xpath("//button[text()='Add User']"));

	public void clickOnAddUserButton() {
		buttonAddUser.click();
	}
	
	public boolean verifyAddUserButton() {
		return buttonAddUser.isDisplayed();
	}
}
