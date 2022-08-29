package SeleniumDay9_WebTableHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); // use to

		String parentAddress = driver.getWindowHandle(); // ABC

		System.out.println(parentAddress);
		System.out.println("==================================");

		WebElement button = driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", button); // scrolling

		Thread.sleep(5000);

		button.click();

		Set<String> childwindows = driver.getWindowHandles(); // ABC, DEF, XYZ

		for (String x : childwindows) { // XYZ
			System.out.println(x);      // XYZ
			driver.switchTo().window(x); // XYZ
			System.out.println(driver.getCurrentUrl());
			if (driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/basic-controls.html")) {

				driver.manage().window().maximize();
				Thread.sleep(8000);

				driver.findElement(By.id("firstName")).sendKeys("Skypersuite");
				Thread.sleep(5000);
			}

			// close child windows
			if (driver.getWindowHandle().equals(parentAddress) == false) {
				driver.close();
			}

			// switch to parent window
			driver.switchTo().window(parentAddress);
			Thread.sleep(5000);

		}

		// close parent window
		driver.close();

	}

}
