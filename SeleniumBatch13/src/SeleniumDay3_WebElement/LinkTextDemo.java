package SeleniumDay3_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("https://demo.guru99.com/test/newtours/"); // use to open a application url
		
		WebElement registerlink = driver.findElement(By.xpath("REGISTER")); // exact value
		
		registerlink.click();
		
		driver.close();

	}

}
