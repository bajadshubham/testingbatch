package SeleniumDay11_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html"); // use to
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement button = driver.findElement(By.xpath("//button[@id='btn1']"));
		
		button.click();
		
		WebElement textBox = driver.findElement(By.xpath("(//input[@id='txt1'])[1]"));
		
		textBox.sendKeys("SkyPersuite");
		
		driver.close();

	}

}
