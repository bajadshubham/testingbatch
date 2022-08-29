package SeleniumDay10_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html"); // use to

		Actions act = new Actions(driver);

		WebElement usernamelabel = driver.findElement(By.xpath("//label[@for='inputPassword3']"));

		act.doubleClick(usernamelabel).build().perform();

		Thread.sleep(4000);

		// copy operation
		act.keyDown(Keys.CONTROL).build().perform(); // press control button
		act.sendKeys("c").build().perform(); // press + release
		act.keyUp(Keys.CONTROL).build().perform(); // release control button

		act.sendKeys(Keys.TAB).build().perform(); // tab operation (Press + release)
		
		Thread.sleep(4000);

		// paste operation
		act.keyDown(Keys.CONTROL).build().perform(); // press control button
		act.sendKeys("v").build().perform(); // press + release
		act.keyUp(Keys.CONTROL).build().perform();// release control button
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
