package SeleniumDay21_RobotClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://blueimp.github.io/jQuery-File-Upload/"); // use to
		
		WebElement addFileButton = driver.findElement(By.xpath("//span[@class='btn btn-success fileinput-button']"));

		addFileButton.click();
		
		Thread.sleep(5000);
		
		// We have to pass path of file which we want to upload
		StringSelection stringselection = new StringSelection("C:\\Users\\hp\\Desktop\\CLass\\JS.txt");
		
		// copy the file path on system clipbaord
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
		
		Thread.sleep(5000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL); // VK - virtual key
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
