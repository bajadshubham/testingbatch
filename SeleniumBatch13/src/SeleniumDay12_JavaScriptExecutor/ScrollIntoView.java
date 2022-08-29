package SeleniumDay12_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://www.seleniumeasy.com/"); // use to
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)",""); // scroll from top to bottom
		
		Thread.sleep(5000);
		
		WebElement homeOption = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
		
		WebElement subscribeButton = driver.findElement(By.xpath("//input[@name='subscribe']"));
		
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@name='EMAIL']"));

		js.executeScript("arguments[0].scrollIntoView(true)",homeOption);
		
		Thread.sleep(5000);

		js.executeScript("arguments[0].scrollIntoView(true)",subscribeButton);
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].value='skypersuite@gmail.com'",emailTextBox);
		//arguments[0].value='skypersuite@gmail.com' --> enter a value
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].click()",subscribeButton);
		// arguments[0].click() --> click on element
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
