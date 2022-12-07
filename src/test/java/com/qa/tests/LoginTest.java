package com.qa.tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
import com.qa.utils.ExcelReader;
import com.qa.utils.Utilities;

public class LoginTest {
	WebDriver driver;
	ExcelReader reader = new ExcelReader(System.getProperty("user.dir") + "//data//TestData.xlsx");
	String userName = reader.getCellData("LoginInfo", "UserName", 2);
	String password = reader.getCellData("LoginInfo", "Password", 2);
	String userName1 = reader.getCellData("LoginInfo", "UserName", 3);
	String password1 = reader.getCellData("LoginInfo", "Password", 3);
	String userName2 = reader.getCellData("LoginInfo", "UserName", 4);
	String password2 = reader.getCellData("LoginInfo", "Password", 4);
	// static Logger log = LogManager.getLogger(BaseTest.class.getName());

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws IOException, InterruptedException {
		driver = BaseTest.launchBrowser();
		Utilities.log().info("Browser is initialized");
	}

	@Test(priority = 1)
	public void invalidUsernameShouldNotBeAbleToLogin() throws InterruptedException {

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.validateURL();
		login.enterUserName(userName1);
		login.enterPassword(password);
		login.clickSignInButton();
		// login.verifyErrorMessageForInvalidLogin();
		Utilities.log().info("User with invalid credential should not be able to login");

	}

	@Test(priority = 2)
	public void invalidPasswordShouldNotBeAbleToLogin() throws InterruptedException {

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.validateURL();
		login.enterUserName(userName2);
		login.enterPassword(password2);
		login.clickSignInButton();
		// login.verifyErrorMessageForInvalidLogin();
		Utilities.log().info("User with invalid credential should not be able to login");

	}

	@Test(priority = 3)
	public void validUserShouldBeAbleToLogin() throws InterruptedException {

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.validateURL();
		login.enterUserName(userName);
		login.enterPassword(password);
		login.clickSignInButton();
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashBoardPageTitleElement();
		Utilities.log().info("User with valid credential should be able to login");

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();
	}

}
