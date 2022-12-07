package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.qa.utils.Utilities;

public class AddNewContactPage {

	WebDriver driver;

	public AddNewContactPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//a[@id='contact_add']")
	WebElement ADD_NEW_CUSTOMER_LINK_LOCATOR;
	@FindBy(how = How.XPATH, using = "//h3[normalize-space()='Add New Contact']")
	WebElement VALIDATE_ADD_NEW_CONTACT_PAGE_TITLE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULLNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='company']")
	WebElement COMPANYNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='m_address']")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_REGION_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='account']")
	WebElement ZIP_POSTALCODE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_DROPDOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@id='contact_submit']")
	WebElement ADD_CONTACT_BUTTON_LOCATOR;

//Methods to interact with the elements
	public void verifyAddNewContactPageTitle() {
		Assert.assertEquals(VALIDATE_ADD_NEW_CONTACT_PAGE_TITLE_LOCATOR.getText(), "Add New Contact",
				"Add New Contact page title did not display!!!");
	}

	public AddNewContactPage enterFullName(String fullname) throws InterruptedException {
		Utilities.waitForElement(FULLNAME_FIELD_LOCATOR, driver, 30);
		FULLNAME_FIELD_LOCATOR.sendKeys(fullname);
		return this;
	}

	public AddNewContactPage enterCompanyName(String companyName) throws InterruptedException {
		Utilities.waitForElement(COMPANYNAME_FIELD_LOCATOR, driver, 30);
		COMPANYNAME_FIELD_LOCATOR.sendKeys(companyName);
		return this;
	}

	public AddNewContactPage enterEmailAddress(String emailAdrress) throws InterruptedException {
		Utilities.waitForElement(EMAIL_FIELD_LOCATOR, driver, 30);
		EMAIL_FIELD_LOCATOR.sendKeys(emailAdrress);
		return this;
	}

	public AddNewContactPage enterPhoneNumber(String phoneNumber) throws InterruptedException {
		Utilities.waitForElement(PHONE_FIELD_LOCATOR, driver, 30);
		PHONE_FIELD_LOCATOR.sendKeys(phoneNumber);
		return this;
	}

	public AddNewContactPage enterAddress(String address) throws InterruptedException {
		Utilities.waitForElement(ADDRESS_FIELD_LOCATOR, driver, 30);
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
		return this;
	}

	public AddNewContactPage enterCity(String city) throws InterruptedException {
		Utilities.waitForElement(CITY_FIELD_LOCATOR, driver, 30);
		CITY_FIELD_LOCATOR.sendKeys(city);
		return this;
	}

	public AddNewContactPage enterStateRegion(String stateregion) throws InterruptedException {
		Utilities.waitForElement(STATE_REGION_FIELD_LOCATOR, driver, 30);
		STATE_REGION_FIELD_LOCATOR.sendKeys(stateregion);
		return this;
	}

	public AddNewContactPage enterZipCode(String zipcode) throws InterruptedException {
		Utilities.waitForElement(ZIP_POSTALCODE_FIELD_LOCATOR, driver, 30);
		ZIP_POSTALCODE_FIELD_LOCATOR.sendKeys(zipcode);
		return this;
	}

	public void selectCountry() throws InterruptedException {
		Utilities.waitForElement(COUNTRY_DROPDOWN_LIST_LOCATOR, driver, 30);
		Utilities.dropDownList(COUNTRY_DROPDOWN_LIST_LOCATOR, "United States");
	}

	public void clickOnAddContactButton() throws InterruptedException {
		Utilities.waitForElement(ADD_CONTACT_BUTTON_LOCATOR, driver, 30);
		ADD_CONTACT_BUTTON_LOCATOR.click();
	}
}