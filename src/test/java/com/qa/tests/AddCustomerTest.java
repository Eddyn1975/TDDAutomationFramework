package com.qa.tests;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.qa.base.BaseTest;
import com.qa.pages.AddCustomerPage;
import com.qa.pages.ContactsViewSummaryPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.GroupsPage;
import com.qa.pages.ListCustomersPage;
import com.qa.pages.LoginPage;
import com.qa.pages.SideNavigationPage;
import com.qa.utils.ExcelReader;
import com.qa.utils.Utilities;

public class AddCustomerTest {
	WebDriver driver;
	Random rnd = new Random();
	Faker faker = new Faker();
	ExcelReader reader = new ExcelReader(System.getProperty("user.dir") + "//data//TestData.xlsx");
	String userName = reader.getCellData("LoginInfo", "UserName", 2);
	String password = reader.getCellData("LoginInfo", "Password", 2);
	String fullName = reader.getCellData("AddCustomer", "FullName", 2);
	String Email = reader.getCellData("AddCustomer", "Email", 2) + Utilities.randomNumGenerator();
	String Phone = reader.getCellData("AddCustomer", "Phone", 2) + Utilities.randomNumGenerator();
	String Address = reader.getCellData("AddCustomer", "Address", 2);
	String City = reader.getCellData("AddCustomer", "City", 2);
	String State = reader.getCellData("AddCustomer", "State", 2);
	String ZipCode = reader.getCellData("AddCustomer", "ZipCode", 2);
	String Country = reader.getCellData("AddCustomer", "Country", 2);
	String Tags = reader.getCellData("AddCustomer", "Tags", 2);
	String Currency = reader.getCellData("AddCustomer", "Currency", 2);
	String Group = reader.getCellData("AddCustomer", "Group", 2);
	String Password_2 = reader.getCellData("AddCustomer", "Password_2", 2);
	String ConfirmPassword = reader.getCellData("AddCustomer", "ConfirmPassword", 2);

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws IOException, InterruptedException {
		driver = BaseTest.launchBrowser();
		Utilities.log().info("Browser is initialized");
	}

	@Test()
	public void AddCustomerContact() throws InterruptedException {

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clickSignInButton();
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateURL();
		dashboardPage.verifyDashBoardPageTitleElement();
		Utilities.log().info("User with valid credential should be able to login");
		SideNavigationPage sidenavigation = PageFactory.initElements(driver, SideNavigationPage.class);
		sidenavigation.goToAddCustomerPage();
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateURL();
		addCustomerPage.verifyPageTitleElement();
		addCustomerPage.windowScrollUp();
		addCustomerPage.enterfullName(fullName);
		addCustomerPage.enterCompanyName("Techfios");
		addCustomerPage.enterEmailAddress(Email);
		addCustomerPage.enterPhoneNumber(Phone);
		addCustomerPage.enterAddress(Address);
		addCustomerPage.enterCity(City);
		addCustomerPage.enterState(State);
		addCustomerPage.enterZipCode(ZipCode);
		addCustomerPage.enterCountryName(Country);
		addCustomerPage.enterTagName(Tags);
		addCustomerPage.enterCurrency(Currency);
		addCustomerPage.enterGroup(Group);
		addCustomerPage.enterPassword(Password_2);
		addCustomerPage.enterConfirmPassword(ConfirmPassword);
		addCustomerPage.clickOnWelcomeEmail();
		addCustomerPage.clickOnSaveButton();
		ContactsViewSummaryPage contactsviewsummarypage = PageFactory.initElements(driver,
				ContactsViewSummaryPage.class);
		contactsviewsummarypage.verifyPageTitleElement();
		contactsviewsummarypage.validateCustomerContactName();
		sidenavigation.goToListCustomersPageWithoutClickingOnModule();
		ListCustomersPage listCustomersPage = PageFactory.initElements(driver, ListCustomersPage.class);
		listCustomersPage.validateURL();
		listCustomersPage.verifyContactsPageTitleElement();
		sidenavigation.goToGroupsPageWithoutClickingOnModule();
		GroupsPage groupsPage = PageFactory.initElements(driver, GroupsPage.class);
		groupsPage.validateURL();
		groupsPage.verifyContactsPageTitleElement();
		groupsPage.ClickOnListContactButton();
		groupsPage.isDataMatching();
		groupsPage.ClickOnDeleteButton();
		groupsPage.ClickOnOKButton();

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();
	}

}
