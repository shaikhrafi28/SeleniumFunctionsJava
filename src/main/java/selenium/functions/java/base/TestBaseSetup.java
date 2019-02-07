package selenium.functions.java.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.functions.java.util.TestUtil;

public class TestBaseSetup {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;

	public TestBaseSetup() {// constructor
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					+ "/src/main/java/selenium/functions/java/testdata/config.properties");
			prop.load(ip);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// To select and initialise the web browser
	public static void initialization(String browserName) {

		if (browserName.equals("chrome")) {

			// WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:/Selenium/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Invoked");

		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox Invoked");
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("IE Invoked");
		}

		else {
			System.out.println("No Browser found");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public void closebrowser() {
		// Closing via JavaScript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.close()");

	}
}
