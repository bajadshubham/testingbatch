package SeleniumDay5_SelectAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html"); // use to open a application url
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select obj = new Select(dropdown);
		
		obj.selectByVisibleText("HP");
		
		Thread.sleep(5000);
		
		obj.selectByValue("Delhi");
		
		Thread.sleep(5000);
		
		obj.selectByIndex(1);
		
		Thread.sleep(5000);
		
		System.out.println(obj.isMultiple()); // false
		
//		obj.selectByVisibleText("userLoginHistory");
//		obj.selectByVisibleText("changePassword");
//		obj.selectByVisibleText("uploadProfilePic");
//		
//		obj.deselectByVisibleText("userLoginHistory");
//		obj.deselectAll(); // deselect all the selected option
		
//		obj.deselectByIndex(1);
		
		driver.close();

	}

}
