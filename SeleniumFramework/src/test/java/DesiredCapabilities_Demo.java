import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);

		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver(caps);

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("test");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		driver.close();
		driver.quit();
	}

}
