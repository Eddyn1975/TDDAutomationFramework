package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.qa.utils.Utilities;

public class TransferPage {
	WebDriver driver;

	public TransferPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Contacts')]")
	WebElement CONTACTS_ELEMENT;

//Methods to interact with the elements
	public void validateURL() {
		String expectedURL = "https://techfios.com/billing/?ng=contacts/list/";
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, expectedURL, "Wrong URL!!!");

	}

	public void verifyContactsElement() throws InterruptedException {
		String ContactsTextMessage = CONTACTS_ELEMENT.getText();
		System.out.println("The Welcome Contacts message is :" + ContactsTextMessage);
		Utilities.waitForElement(CONTACTS_ELEMENT, driver,30);
		Assert.assertEquals(CONTACTS_ELEMENT.getText(), "Contacts", "Contacts Page Title did not display!!!!!!");

	}
}
