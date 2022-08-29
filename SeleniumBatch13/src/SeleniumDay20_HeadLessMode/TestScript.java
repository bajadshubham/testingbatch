package SeleniumDay20_HeadLessMode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class TestScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		ChromeOptions  option = new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option); // Run time polymorphism
		
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/logout.html");
		
		WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

		emailTextBox.sendKeys("kiran@gmail.com"); // use to enter a value
		
		
		passwordTextBox.sendKeys("123456"); // use to enter a value
		

		submitButton.click(); // use to click on button
		
		System.out.println("test");
		
		Assert.assertTrue(true);
		
		Thread.sleep(5000);

	}

}
