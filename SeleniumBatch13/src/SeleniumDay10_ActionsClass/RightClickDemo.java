package SeleniumDay10_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://demo.guru99.com/test/drag_drop.html"); // use to
		
		Actions act = new Actions(driver);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		act.click(email).build().perform();
		
		act.contextClick().build().perform();
		
		driver.close();

	}

}
