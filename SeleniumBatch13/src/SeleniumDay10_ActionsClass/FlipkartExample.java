package SeleniumDay10_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://www.flipkart.com/"); // use to

		Actions act = new Actions(driver);

		act.sendKeys(Keys.ESCAPE).build().perform();

		Thread.sleep(5000);

		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		act.moveToElement(electronics).build().perform();

		Thread.sleep(5000);

		WebElement computerperipherals = driver.findElement(By.xpath("//a[text()='Computer Peripherals']"));

		act.moveToElement(computerperipherals).build().perform();

		Thread.sleep(5000);
		
		WebElement printers = driver.findElement(By.xpath("//a[text()='Printers']"));

		act.moveToElement(printers).click().build().perform();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
