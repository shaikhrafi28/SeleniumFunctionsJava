package com.caqhgroups.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.functions.java.base.TestBaseSetup;


public class ExtractQuestions extends TestBaseSetup {

/*	SignInPage signinPage;
	HomePage homePage;
	ExtractWebPageData authPage;

	public ExtractQuestions() {
		super();
	}

	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser) throws InterruptedException {
		initialization(browser);
		signinPage = new SignInPage();
		homePage = signinPage.login(prop.getProperty("uname"), prop.getProperty("pswd"));
		authPage = homePage.clickOnAuthNav();

	}

	@Test(priority = 1)
	public void authpagetest1() {
		authPage.clickOnALL();
		authPage.clickOnAuthorized();
		authPage.clickOnPending();
		authPage.clickOnDenied();
	}

	@AfterTest
	public void closebrowser() {

		driver.quit();

	}
*/
}
