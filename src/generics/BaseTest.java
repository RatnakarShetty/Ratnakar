package generics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(FWListners.class)
public class BaseTest implements IAutoConst {

	public static WebDriver driver;

	@BeforeSuite(alwaysRun=true)
	public void setDriverPath() {

		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);

	}

	@Parameters({"node","browser"})
	@BeforeMethod(alwaysRun=true)
	public void openApp(String node, String browser) throws MalformedURLException {
		//System.out.println("hgjhjgh");
		// new Code for grid

		//URL whichSys = new URL("http://127.0.0.1:4444/wd/hub/");
		URL whichSys = new URL(node);

		DesiredCapabilities whichBrowser = new DesiredCapabilities();
		whichBrowser.setBrowserName(browser);

		driver = new RemoteWebDriver(whichSys, whichBrowser);
		// driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/rshetty3/login.do");
	}

	@AfterMethod(alwaysRun=true)
	public void closeApp() {
		driver.quit();
	}

}
