package SeleniumDay18_POMClassBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPageClass extends BaseClass{
	
	
	private WebElement userTab = driver.findElement(By.xpath("//span[text()='Users']"));
	private WebElement dashboardTab = driver.findElement(By.xpath("//span[text()='Dashboard']"));
	
	public void clickOnUserTab() {
		userTab.click();
	}
	
	public boolean verifyDashboardTab() {
		return dashboardTab.isDisplayed();
	}

}
