package selenium.functions.java.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import selenium.functions.java.base.TestBaseSetup;

import org.apache.poi.sl.usermodel.Sheet;


public class TestUtil extends TestBaseSetup {

	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 30;

	public static String TESTDATA_SHEET_PATH = "/Selenium/Workspaces/Udemy/CAQHGroupsPortalTest/src/main/java/com/caqhgroups/qa/testdata/FreeCrmTestData.xlsx";

	static Sheet sheet;

	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	

	

}
