package SeleniumDay8_WebTable;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class StudentAssignment {

	@Test
	public void assignment() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://demoblaze.com/index.html");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Log in']")));
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("jadhavdigvijay4696@gmail.com");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("India@123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,1000)", "");

		WebElement phone = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
		phone.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement cart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
		cart.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();

		driver.findElement(By.xpath("//a[text()='Laptops']")).click();
		js.executeScript("window.scrollBy(0,3000)", ""); // scroll vertically down
		Thread.sleep(2000);


		driver.findElement(By.xpath("//a[text()='Dell i7 8gb']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		action.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();

		driver.findElement(By.xpath("//a[text()='Monitors']")).click();


		driver.findElement(By.xpath("//a[text()='ASUS Full HD']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		action.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		Thread.sleep(2000);
		
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		List<WebElement> allProducts = driver.findElements(By.xpath("//tbody[@id='tbodyid']/tr/td[2]"));
		Set<String> sortedProduct = new TreeSet();
		
		for(int i=0;i<allProducts.size();i++) {
			WebElement product = allProducts.get(i);
			sortedProduct.add(product.getText());
		}
		
		System.out.println(sortedProduct);
		
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		action.moveToElement(driver.findElement(By.xpath("//input[@id='name']"))).click().build().perform();
		action.sendKeys("Digvijay").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@id='country']"))).click().build().perform();
		action.sendKeys("India").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@id='city']"))).click().build().perform();
		action.sendKeys("Mumbai").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@id='card']"))).click().build().perform();
		action.sendKeys("12345678").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@id='month']"))).click().build().perform();
		action.sendKeys("june").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@id='year']"))).click().build().perform();
		action.sendKeys("2022").build().perform();
	
		WebElement purchaseButton = driver.findElement(By.xpath("//button[text()='Purchase']"));
		js.executeScript("arguments[0].scrollIntoView(true)", purchaseButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", purchaseButton);
		
		WebElement okButton = driver.findElement(By.xpath("//button[text()='OK']"));
		
		wait.until(ExpectedConditions.visibilityOf(okButton));
		
		okButton.click();
		
		WebElement cartTab = driver.findElement(By.xpath("//a[text()='Cart']"));
		
		cartTab.click();
	}

}
