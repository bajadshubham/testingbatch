package SeleniumDay21_RobotClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot; // to import robot class
import java.awt.event.KeyEvent;

public class RobotKeywordDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html"); // use to

		Actions act = new Actions(driver);

		WebElement usernamelabel = driver.findElement(By.xpath("//label[@for='inputPassword3']"));

		act.doubleClick(usernamelabel).build().perform();

		Thread.sleep(4000);

		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL); // VK - virtual key
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(4000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(4000);
		
		robot.keyPress(KeyEvent.VK_CONTROL); // VK - virtual key
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
