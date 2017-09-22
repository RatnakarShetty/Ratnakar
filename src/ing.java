import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ing {
	
	static {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";

		String key1 = "webdriver.gecko.driver";
		String value1 = "./drivers/geckodriver.exe";

		System.setProperty(key, value);
		System.setProperty(key1, value1);

	}

	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/");
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL +"p");
		
		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\g.exe");
		
	}

}
