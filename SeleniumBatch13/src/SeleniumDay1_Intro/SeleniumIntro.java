package SeleniumDay1_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		// webdriver.chrome.driver - chromedriver
		// webdriver.gecko.driver - firefox
		// webdriver.microsoftedge.driver - microsoft edge
		
		WebDriver driver = new ChromeDriver(); // Run time polymorphism
		
		// WebDriver --> Interface
		// ChromeDriver --> class
		// driver --> object name

	}

}
