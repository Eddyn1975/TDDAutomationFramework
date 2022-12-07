package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.qa.utils.Utilities;

public class InvoicesPages {
	WebDriver driver;

	public InvoicesPages(WebDriver driver) {

		this.driver = driver;

	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Contacts')]")
	WebElement INVOICES_PAGE_TITLE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@class='ibox-title']")
	WebElement CUSTOMER_CONTACT_NAME_LOCATOR;

	// Methods to interact with the elements
	
	public void validateURL() {
		String expectedURL= "https://techfios.com/billing/?ng=invoices/list/";
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, expectedURL, "Wrong URL!!!");

	}
	public void verifyInvoicesPageTitleElement() throws InterruptedException {
		String ContactsTextMessage = INVOICES_PAGE_TITLE_LOCATOR.getText();
		System.out.println("The Welcome Contacts message is :"+ ContactsTextMessage);
		Utilities.waitForImplicitlyWait(driver, 15);
		Assert.assertEquals(INVOICES_PAGE_TITLE_LOCATOR.getText(), " Invoices", " Invoices page title name did not display!!!!!!");

	}
	/*
	public void validateAccountName() {
		System.out.println("The Customer Contact full name :"+ CUSTOMER_CONTACT_NAME_LOCATOR.getText());
		Assert.assertEquals(CUSTOMER_CONTACT_NAME_LOCATOR.getText(), "Volodymyr Zelenskyy", "Customer Contact name did not display!!!!!!");
	}*/

}


