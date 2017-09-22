import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class G_NaukriResumeUpload {

	static {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";

		String key1 = "webdriver.gecko.driver";
		String value1 = "./drivers/geckodriver.exe";

		System.setProperty(key, value);
		System.setProperty(key1, value1);

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		// driver.manage().window().maximize();

		System.out.println(System.getProperty("webdriver.gecko.driver"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://login.naukri.com/nLogin/Login.php");

		driver.findElement(By.id("emailTxt")).sendKeys("ratnakargh8@gmail.com");
		driver.findElement(By.id("pwd1")).sendKeys("ganesh21");
		driver.findElement(By.name("Login")).click();

		// String xp = "//ul/li/a[4]";.//*[@id='editForm']/div[7]/button

		driver.findElement(By.partialLinkText("Attached Resume")).click();
		driver.findElement(By.partialLinkText("Upload New Resume")).click();

		WebElement uploadElement = driver.findElement(By.id("attachCV"));

		uploadElement.sendKeys("C:/Users/user/Desktop/Resumes/Ratnakar_2.6yrs_ManualAndDataBaseTesting_immediate.docx");

		// driver.findElement(By.className("w85bt fl")).click();

		String xp = "//*[@id='editForm']/div[7]/button";

		driver.findElement(By.xpath(xp)).click();

		String text = driver.findElement(By.id("confirmMessage")).getText();

		if (text.contains("Your naukri profile has been updated with your uploaded resume")) {
			System.out.println("Upload Compleated Succesfully");
		}

		driver.close();

	}
}
