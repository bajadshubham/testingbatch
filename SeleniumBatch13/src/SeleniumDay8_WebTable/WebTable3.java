package SeleniumDay8_WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/users.html"); // use to

		List<WebElement> allrows = driver.findElements(By.xpath("//table/tbody/tr"));

		// to access each row
		for (int i = 2; i <= allrows.size(); i++) {

			List<WebElement> tabledata = driver.findElements(By.xpath("//table/tbody/tr[" + i + "]/td"));
			
			// to access each column
			for (int j = 1; j <= tabledata.size(); j++) {

				WebElement data = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(data.getText() + " | ");

			}

			System.out.println();

		}
		
		driver.close();

	}

}
