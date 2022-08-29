package SeleniumDay5_SelectAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("https://demo.guru99.com/test/delete_customer.php"); // use to open a application url
		
		WebElement customerId = driver.findElement(By.name("cusid"));
		
		customerId.sendKeys("123");
		
		WebElement submitButton = driver.findElement(By.name("submit"));
		
		submitButton.submit();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
		alert.dismiss();
		
		submitButton.submit();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		driver.close();
		
		
		
		
		

	}

}
