package SeleniumDay11_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html"); // use to

		WebElement button = driver.findElement(By.xpath("//button[@id='btn1']"));

		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver,20); // default timeunit - seconds

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='txt1'])[1]")));
		
		WebElement input = driver.findElement(By.xpath("(//input[@id='txt1'])[1]"));
		
		input.sendKeys("SkyPersuite");

		driver.close();

	}

}
