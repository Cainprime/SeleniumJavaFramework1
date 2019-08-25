package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.exceptions.TestFailedException;
import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplitoolsDemo {
	
	static WebDriver driver;

	public static void main(String[] args) {

		//Use Chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Initialize the eyes SDK and set your private API key.
		Eyes eyes = new Eyes();

		// Set the API key from the env variable. Please read the "Important Note"
		// section above.
		eyes.setApiKey("sC99NoXa0ubo3hSDWC3jraS6rfzJYReKababXGWUWyL8110");

		try {


			// Start the test by setting AUT's name, window or the page name that's being tested, viewport width and height
			eyes.open(driver, "HelloWorld","First applitools test", new RectangleSize(600, 800));

			// Navigate the browser to the "ACME" demo app
			driver.get("https://applitools.com/helloworld?diff2");

			// Visual checkpoint #1.
			eyes.checkWindow("Hello!");

			//🌟 Note: You can have multiple "checkWindow" to create multiple test steps within a test.🌟  
			//For example, you may want to test errors in the login window after clicking a login button,
			//In that case, you may add the following before you call eyes.close(). 
			//This will create a test with two test steps.
			driver.findElement(By.tagName("button")).click();
			eyes.checkWindow("Click!");

			// End the test.
			eyes.close();

		} catch (TestFailedException e) {
			System.out.println("\n" + e + "\n");
		} finally {

			// Close the browser.
			driver.quit();
			System.out.println("Test completed");
			
			// If the test was aborted before eyes.close was called, ends the test as
			// aborted.
			eyes.abortIfNotClosed();

			// End main test
			System.exit(0);
		}

	}
}
