package demo;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceLabsDemo {

	private WebDriver driver;

	@Test
	public void testlinuxChrome(Method method) throws MalformedURLException {

		String sauceUserName = System.getenv("SAUCE_USERNAME");
		String sauceAccessKey = System.getenv("SAUCE_ACCESS_KEY");

		/**
		 * In this section, we will configure our test to run on some specific
		 * browser/os combination in Sauce Labs.*/
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("username", sauceUserName);
		capabilities.setCapability("accessKey", sauceAccessKey);
		capabilities.setCapability("browserName", "chrome");
//		capabilities.setCapability("platform", "windows 10");
		capabilities.setCapability("platform", "Linux");
		capabilities.setCapability("version", "latest");
		capabilities.setCapability("extendedDebugging", "true");
		capabilities.setCapability("buildNumber", "3.0");
		capabilities.setCapability("name", method.getName());

//		DesiredCapabilities capabilities = DesiredCapabilities.safari();
//		capabilities.setCapability("username", sauceUserName);
//		capabilities.setCapability("accessKey", sauceAccessKey);
//		capabilities.setCapability("platform", "macOS 10.14");
//		capabilities.setCapability("version", "12.0");
//		capabilities.setCapability("extendedDebugging", "true");
//		capabilities.setCapability("name", method.getName());

		driver = new RemoteWebDriver(new URL("http://ondemand.saucelabs.com:80/wd/hub"), capabilities);

		//		WebDriverManager.chromedriver().setup();
		//		driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		//	    driver.navigate().to("https://www.saucedemo.com");
		//	    Assert.assertTrue(true);

		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		WebElement elementbtnK = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());

	}

	@AfterMethod
	public void cleanUpAfterTestMethod(ITestResult result) {
		((JavascriptExecutor)driver).executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
		driver.quit();
		System.out.println("Test completed");

	}
}