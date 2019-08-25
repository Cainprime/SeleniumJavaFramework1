package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google search test one", "this is a test to validate good search functionality");
		
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new ChromeDriver();

		test1.log(Status.INFO, "Starting test case");
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered text in Search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test1.pass("clicked");
		
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		
		test1.info("Test completed");
		
		ExtentTest test2 = extent.createTest("Google search test two", "this is a test to validate good search functionality");
		
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new ChromeDriver();

		test2.log(Status.INFO, "Starting test case");
		driver.get("https://google.com");
		test2.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation 2");
		test2.pass("Entered text in Search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test2.fail("clicked");
		
		driver.close();
		driver.quit();
		test2.pass("Closed the browser");
		
		test2.info("Test completed");
		
		extent.flush();
	}

}
