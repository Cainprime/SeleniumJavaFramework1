package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {

	private static WebDriver driver;

	public static void main(String[] args) throws Exception {
		seleniumWaits();
	}

	public static void seleniumWaits() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//250 milliseconds
		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		WebElement elementbtnK = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		driver.findElement(By.name("btnK")).click();
		//WebElement elementabcd = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));		
		//driver.findElement(By.name("abcd")).click();

		driver.close();
		driver.quit();
	}

}
