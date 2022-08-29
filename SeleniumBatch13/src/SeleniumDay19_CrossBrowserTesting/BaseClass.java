package SeleniumDay19_CrossBrowserTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	static WebDriver driver;
	static Logger log;
	static Properties prop;
	static FileInputStream fip;
	static OutputStream output;

	@BeforeClass
	@Parameters({ "BrowserName" }) // chrome

	public void openBrowser(String browsername) throws IOException { // (chrome)

		fip = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumBatch13\\projectconfig.properties");
		prop = new Properties();
		prop.load(fip);
		output = new FileOutputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumBatch13\\projectconfig.properties");
		
		
		// path of log4j file
		PropertyConfigurator.configure("C:\\Users\\hp\\eclipse-workspace\\SeleniumBatch13\\Log4jConfigFile.properties");
		
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver(); // Run time polymorphism
		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\firefox.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\ie.exe");
			driver = new InternetExplorerDriver();
		} else if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edge.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize(); // use to maximize a browser

		driver.get(prop.getProperty("url"));
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
