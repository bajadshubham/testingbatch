package SeleniumDay10_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickRightClickDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://opensource-demo.orangehrmlive.com/"); // use to
		
		Actions act = new Actions(driver);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		act.click(username).build().perform();
		
		Thread.sleep(5000);
		
		
		Thread.sleep(5000);
		
		act.contextClick().build().perform();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
