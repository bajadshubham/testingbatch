package SeleniumDay5_SelectAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html"); // use to open a application url
		
        driver.switchTo().frame("frm2");
        
        Thread.sleep(5000);
        
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='Enter First Name']"));
		
        firstName.sendKeys("SkyPersuite");
        
        Thread.sleep(8000);
        
        driver.navigate().refresh(); // frame refresh
        
        Thread.sleep(5000);
        
        driver.switchTo().defaultContent(); // to switch from frame to browser
        
        driver.navigate().refresh(); // browser refresh
        
        Thread.sleep(5000);
        
        driver.close();
		
	}

}
