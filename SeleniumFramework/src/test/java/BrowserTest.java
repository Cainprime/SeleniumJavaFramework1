import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	static WebDriver driver = null;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		//WebDriverManager.firefoxdriver().setup();	
		//driver = new FirefoxDriver();

		//WebDriverManager.iedriver().setup();
		//driver = new InternetExplorerDriver();

		//		WebDriverManager.edgedriver().setup();
		//		driver = new EdgeDriver();

		driver.get("https://google.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		//driver.quit();
		System.out.println("Test completed");

	}
}