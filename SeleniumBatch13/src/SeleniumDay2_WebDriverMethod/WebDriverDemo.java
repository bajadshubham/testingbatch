package SeleniumDay2_WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Run time polymorphism

		driver.manage().window().maximize(); // use to maximize a browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // use to open a application url
		
		String title = driver.getTitle(); // fetch page title
		System.out.println(title);
		
		String url = driver.getCurrentUrl(); // fetch current url
		System.out.println(url);
		
		if(url.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/")) {
			System.out.println("You are on login page");
		}else {
			System.out.println("Error");
		}
		
		
//		String source = driver.getPageSource();
//		System.out.println(source);
		
		driver.close(); // use to close a browser
	
	
	
	}

}
