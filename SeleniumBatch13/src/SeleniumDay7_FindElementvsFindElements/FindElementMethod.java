package SeleniumDay7_FindElementvsFindElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://opensource-demo.orangehrmlive.com/"); // use to open a application url

		WebElement alllinks = driver.findElement(By.xpath("//a[text()='Forgot your password12313?']")); // returns multiple element
		
		driver.close();


	}

}
