package SeleniumDay8_WebTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/users.html"); // use to open a application url

		List<WebElement> data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		Iterator itr = data.iterator();
		
		while(itr.hasNext()) {
			WebElement wb = (WebElement) itr.next();
			System.out.println(wb.getText());
		}
		
		
		driver.close();
	}

}
