package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {
	
	private static WebDriver driver;
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//options.addArguments("window-size=1920,1080");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation test");
		WebElement elementbtnK = wait.until(ExpectedConditions
				.elementToBeClickable(By.name("btnK")));
		driver.findElement(By.name("btnK")).click();
		
		driver.close();
		driver.quit();
		System.out.println("Completed");

	}

}
