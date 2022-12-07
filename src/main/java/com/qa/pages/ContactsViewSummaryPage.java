package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.qa.utils.Utilities;

public class ContactsViewSummaryPage {
	WebDriver driver;

	public ContactsViewSummaryPage(WebDriver driver) {

		this.driver = driver;

	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Contacts')]")
	WebElement CONTACTS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//div[@class='ibox-title']")
	WebElement CUSTOMER_CONTACT_NAME_LOCATOR;

	// Methods to interact with the elements
	
	public void verifyPageTitleElement() throws InterruptedException {
		Utilities.waitForElement(CONTACTS_ELEMENT, driver, 30);
		String ContactsTextMessage = CONTACTS_ELEMENT.getText();
		System.out.println("The page title is :"+ ContactsTextMessage);
		Utilities.waitForElement(CONTACTS_ELEMENT, driver, 30);
		Assert.assertEquals(CONTACTS_ELEMENT.getText(), "Contacts", "Contact Page title name did not display!!!!!!");

	}
	public void validateCustomerContactName() throws InterruptedException {
		Utilities.threadsleep(3000);
		System.out.println("The expected Customer name :"+ CUSTOMER_CONTACT_NAME_LOCATOR.getText());
		Utilities.threadsleep(3000);
		Assert.assertEquals(CUSTOMER_CONTACT_NAME_LOCATOR.getText(), "Volodymyr Zelenskyy", "Customer Contact name did not display!!!!!!");
	}

}
