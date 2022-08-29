package SeleniumDay2_WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // use to open a application url
		
		Thread.sleep(5000); // 5000 - ms // add pause in script execution
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().back(); // to perform backword operation
		
		Thread.sleep(5000);
		
		driver.navigate().forward(); // to perform forward operation
		
		Thread.sleep(5000);
		
		driver.navigate().refresh(); // to perform refresh operation
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
