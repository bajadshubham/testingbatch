package SeleniumDay8_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowHandling1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://demo.guru99.com/popup.php"); // use to
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("emailid")).sendKeys("sky@gmail.com");
		
		driver.quit();


	}

}
