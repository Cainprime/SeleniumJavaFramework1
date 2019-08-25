package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {
	
	private static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//options.addArguments("window-size=1920,1080");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		
		driver.get("http://tinyupload.com");
		driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		
		Runtime.getRuntime().exec("E:\\Program Files (x86)\\AutoIt3\\FileUploadScript.exe");

		Thread.sleep(10000);
		
		driver.close();
		driver.quit();
		
	}
	
}
