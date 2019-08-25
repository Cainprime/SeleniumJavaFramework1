package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	private static WebDriver driver;

	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		WebElement elementbtnK = wait.until(ExpectedConditions
				.elementToBeClickable(By.name("btnK")));
		driver.findElement(By.name("btnK")).click();

		driver.findElement(By.linkText("Home Page - ABCD")).click();

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> waitF = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement element = waitF.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkElement = driver.findElement(By.linkText("Home Page - ABCD"));

				if(linkElement.isEnabled()) {
					System.out.println("Element found");

				}
				return linkElement;
			}
		});

		element.click();

		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
