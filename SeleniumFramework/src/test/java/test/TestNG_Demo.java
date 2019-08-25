package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4jDemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {

	private static WebDriver driver = null;
	public static String browserName = null;
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	@BeforeTest
	public void setUpTest() {
		PropertiesFile.getProperties();

		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		logger.info("Browser started");

	}

	@Test
	public static void googleSearch() {

		//goto google.com
		driver.get("https://google.com");

		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");

		//hit enter key on search textbox
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@AfterTest
	public void tearDownTest() {

		//close browser
		driver.close();
		//driver.quit();
		System.out.println("Test completed successfully");
		PropertiesFile.setProperties();

	}

}
