package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.github.dockerjava.api.model.Driver;
import com.qa.base.BaseTest;
import com.qa.utils.Utilities;

public class AddCustomerPage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Contacts')]")
	WebElement CONTACTS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULLNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_DROP_DOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_REGION_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_CODE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_DROP_DOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='tags']")
	WebElement TAGS_DROP_DOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='currency']")
	WebElement CURRENCY_DROP_DOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")
	WebElement GROUP_DROP_DOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='cpassword']")
	WebElement CONFIRM_PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Yes')]")
	WebElement WELCOME_EMAIL_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Yes')]")
	WebElement YES_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//table/descendant::tr[2]/td[7]/a[2]/i")
	WebElement DELETE_CUSTOMER_CONTACT_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK')]")
	WebElement CLICK_OK_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//body/section[1]/div[1]/div[1]/div[3]/div[1]")
	WebElement CUSTOMER_CONTACT_MESSAGE_DELETED_SUCCESSFULLY_LOCATOR;

	// Methods to interact with the elements
	public void validateURL() {
		String expectedURL = "https://techfios.com/billing/?ng=contacts/add/";
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, expectedURL, "Wrong URL!!!");

	}

	public void verifyPageTitleElement() throws InterruptedException {
		Utilities.waitForElement(CONTACTS_ELEMENT, driver, 30);
		Assert.assertEquals(CONTACTS_ELEMENT.getText(), "Contacts", "Contacts Page Title did not display!!!");

	}

	public void windowScrollUp() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,-8000)");
		
	}

	public void enterfullName(String fullName) throws InterruptedException {
		Utilities.waitForElement(FULLNAME_FIELD_LOCATOR, driver, 30);
		FULLNAME_FIELD_LOCATOR.sendKeys(fullName);
		
		
	}

	public void enterCompanyName(String CompanyName) throws InterruptedException {
		Utilities.waitForElement(COMPANY_DROP_DOWN_LIST_LOCATOR, driver, 30);
		Utilities.dropDownList(COMPANY_DROP_DOWN_LIST_LOCATOR, CompanyName);
		
	}

	public void enterEmailAddress(String emailAddress) throws InterruptedException {
		Utilities.waitForElement(EMAIL_FIELD_LOCATOR, driver, 30);
		EMAIL_FIELD_LOCATOR.sendKeys(emailAddress);
		
	}

	public void enterPhoneNumber(String phoneNumber) throws InterruptedException {
		Utilities.waitForElement(PHONE_FIELD_LOCATOR, driver, 30);
		PHONE_FIELD_LOCATOR.sendKeys(phoneNumber);
		
	}

	public void enterAddress(String address) throws InterruptedException {
		Utilities.waitForElement(ADDRESS_FIELD_LOCATOR, driver, 30);
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
		
	}

	public void enterCity(String city) throws InterruptedException {
		Utilities.waitForElement(CITY_FIELD_LOCATOR, driver, 30);
		CITY_FIELD_LOCATOR.sendKeys(city);
		
	}

	public void enterState(String state) throws InterruptedException {
		Utilities.waitForElement(STATE_REGION_FIELD_LOCATOR, driver, 30);
		STATE_REGION_FIELD_LOCATOR.sendKeys(state);
		
	}

	public void enterZipCode(String zipCode) throws InterruptedException {
		Utilities.waitForElement(ZIP_CODE_FIELD_LOCATOR, driver, 30);
		ZIP_CODE_FIELD_LOCATOR.sendKeys(zipCode);
		
	}

	public void enterCountryName(String countryName) throws InterruptedException {
		Utilities.waitForElement(COUNTRY_DROP_DOWN_LIST_LOCATOR, driver, 30);
		Utilities.dropDownList(COUNTRY_DROP_DOWN_LIST_LOCATOR, countryName);
		
	}

	public void enterTagName(String tags) throws InterruptedException {
		Utilities.waitForElement(TAGS_DROP_DOWN_LIST_LOCATOR, driver, 30);
		Utilities.dropDownList(TAGS_DROP_DOWN_LIST_LOCATOR, tags);
		
	}

	public void enterCurrency(String currency) throws InterruptedException {
		Utilities.waitForElement(CURRENCY_DROP_DOWN_LIST_LOCATOR, driver, 30);
		Utilities.dropDownList(CURRENCY_DROP_DOWN_LIST_LOCATOR, currency);
		
	}

	public void enterGroup(String group) throws InterruptedException {
		Utilities.waitForElement(GROUP_DROP_DOWN_LIST_LOCATOR, driver, 30);
		Utilities.dropDownList(GROUP_DROP_DOWN_LIST_LOCATOR, group);
	
	}

	public void enterPassword(String password) throws InterruptedException {
		Utilities.waitForElement(PASSWORD_FIELD_LOCATOR, driver, 30);
		PASSWORD_FIELD_LOCATOR.sendKeys(password);
		
	}

	public void enterConfirmPassword(String confirmPassword) throws InterruptedException {
		Utilities.waitForElement(CONFIRM_PASSWORD_FIELD_LOCATOR, driver, 30);
		CONFIRM_PASSWORD_FIELD_LOCATOR.sendKeys(confirmPassword);
		
	}

	public void clickOnWelcomeEmail() throws InterruptedException {
		Utilities.waitForElement(WELCOME_EMAIL_BUTTON_LOCATOR, driver, 30);
		WELCOME_EMAIL_BUTTON_LOCATOR.click();
		
	}

	public void clickOnSaveButton() throws InterruptedException {
		SAVE_BUTTON_LOCATOR.click();
		Utilities.threadsleep(2000);
		
	}

	String accountDeleted;

	public void ClickOndeleteCustommerButton() throws InterruptedException {
		Utilities.waitForElement(DELETE_CUSTOMER_CONTACT_BUTTON_LOCATOR, driver, 30);
		DELETE_CUSTOMER_CONTACT_BUTTON_LOCATOR.click();
		Utilities.waitForElement(CLICK_OK_BUTTON_LOCATOR, driver, 30);
		CLICK_OK_BUTTON_LOCATOR.click();

	}

	public void verifyCustomerContactDeletionElement() {
		String ExpectedTitleMessage = CUSTOMER_CONTACT_MESSAGE_DELETED_SUCCESSFULLY_LOCATOR.getText();
		// String ActualTitleMessage =
		// "https://techfios.com/billing/?ng=contacts/list/";
		System.out.println("The Expected Title Message :" + ExpectedTitleMessage);
		Assert.assertEquals(CUSTOMER_CONTACT_MESSAGE_DELETED_SUCCESSFULLY_LOCATOR.getText(),
				"×\r\n" + "Contact Deleted Successfully", "Wrong Title Message!!!");
	}
	
}