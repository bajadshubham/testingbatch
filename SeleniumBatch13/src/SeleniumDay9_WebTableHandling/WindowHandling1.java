package SeleniumDay9_WebTableHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://demo.guru99.com/popup.php"); // use to
		
		String parentAddress = driver.getWindowHandle(); // ABC
		
		System.out.println(parentAddress);
		System.out.println("==================================");


		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Thread.sleep(5000);
		
		Set<String> childwindows = driver.getWindowHandles(); // ABC, DEF
		
		Iterator itr = childwindows.iterator();
		
		while(itr.hasNext()) { // DEF
			String address = (String) itr.next();
			System.out.println(address); // DEF
			
			if(!parentAddress.equalsIgnoreCase(address)) { // !ABC.equals(DEF) -> !F --> T
				driver.switchTo().window(address);
				driver.findElement(By.name("emailid")).sendKeys("sky@gmail.com");
				Thread.sleep(5000);
				driver.close();
				Thread.sleep(5000);
			}
			
		}
		
		driver.switchTo().window(parentAddress);

		driver.close();

	}

}
