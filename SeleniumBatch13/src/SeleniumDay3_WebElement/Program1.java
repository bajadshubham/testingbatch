package SeleniumDay3_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // use to open a application url
		
		//int x = 10;
		WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
		
		WebElement passwordTextBox = driver.findElement(By.name("txtPassword"));
		
		WebElement loginButton = driver.findElement(By.className("button"));
		
		usernameTextBox.sendKeys("Admin"); // use to enter a value
		
		passwordTextBox.sendKeys("admin123"); // use to enter a value
		
		loginButton.click(); // use to click on button
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
