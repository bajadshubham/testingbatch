package SeleniumDay6_FindElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("https://opensource-demo.orangehrmlive.com/"); // use to open a application url

		List<WebElement> alllinks = driver.findElements(By.tagName("a")); // returns multiple element

		alllinks.size(); // count of element present in collection

		Iterator itr = alllinks.iterator();
		
		while(itr.hasNext()) {
			WebElement wb = (WebElement) itr.next(); // narrowing
			String text = wb.getAttribute("href");
			System.out.println(text);
		}
		
		alllinks.get(0).click(); // fetch first value and click on it
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
