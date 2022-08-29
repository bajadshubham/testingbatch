package SeleniumDay4_WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // use to open a application url
		
		//int x = 10;
		WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
		
		WebElement passwordTextBox = driver.findElement(By.name("txtPassword"));
		
		WebElement loginButton = driver.findElement(By.className("button"));
		
		System.out.println(usernameTextBox.isDisplayed());// boolean value - true/false
		
		System.out.println(usernameTextBox.isEnabled()); // boolean value - true/false

		String tagname = loginButton.getTagName(); // fetch tag value of particular element
		System.out.println(tagname);
		
		String attribute = loginButton.getAttribute("value"); // fetch attribute value
		System.out.println(attribute);
		
		WebElement forgetpassword = driver.findElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']"));
		
		String text = forgetpassword.getText();
		System.out.println(text);
		
		
		driver.close();
		
	}

}
