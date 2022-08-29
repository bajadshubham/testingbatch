package SeleniumDay10_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://demo.guru99.com/test/drag_drop.html"); // use to
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement To = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		act.dragAndDrop(source,To).build().perform();	
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
