package SeleniumDay12_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://www.seleniumeasy.com/"); // use to
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)",""); // scroll from top to bottom
		
		// (0,1000) --> scroll vertically till 1000 cordinate
		// (500,0)  --> scroll horizontally till 500
		// (500,1000) --> scroll horzintal 500 and verticall 1000
		// (0,-500) --> scroll from bottom to up
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-500)",""); // scroll from bottom to up
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
