package SeleniumDay9_WebTableHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); 
		
		String parentaddress = driver.getWindowHandle();
		
		WebElement button2 = driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", button2);
		
		button2.click();
		
		Set<String> childwindows = driver.getWindowHandles();
		
		Iterator itr = childwindows.iterator();
		
		while(itr.hasNext()) {
			String cwindow = (String) itr.next();
			
			if(!parentaddress.equalsIgnoreCase(cwindow)) {
				driver.switchTo().window(cwindow);
				
				String text = driver.findElement(By.xpath("//div[@dir='ltr' and @trbidi='on']")).getText();
				System.out.println(text);
				driver.close();
			}
			
		}

		driver.switchTo().window(parentaddress);
		driver.close();
	}

}
