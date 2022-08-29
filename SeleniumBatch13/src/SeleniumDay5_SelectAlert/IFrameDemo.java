package SeleniumDay5_SelectAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("https://demo.guru99.com/test/guru99home/"); // use to open a application url
		
		driver.switchTo().frame("a077aa5e"); // we are switching from browser to frame
		
		WebElement image = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		image.click();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
