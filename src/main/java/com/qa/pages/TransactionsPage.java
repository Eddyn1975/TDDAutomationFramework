package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.qa.utils.Utilities;

public class TransactionsPage {
	WebDriver driver;

	public TransactionsPage(WebDriver driver) {

		this.driver = driver;

	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//div[@id='page-wrapper']//descendant::*//div[@class='alert alert-success fade in']/i")
	WebElement VALIDATE_TRANSACTION_MESSAGE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@id='page-wrapper']//descendant::*//div[@class='alert alert-success fade in']/i")
	WebElement VALIDATE_PAGE_TITLE_LOCATOR;

	// Methods to interact with the elements
	public void validateURL() {
		String expectedURL = "https://techfios.com/billing/?ng=transactions/deposit/";
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, expectedURL, "Wrong URL!!!");

	}

	public void validateTransaction() throws InterruptedException {
		String transactionMessage = VALIDATE_TRANSACTION_MESSAGE_LOCATOR.getText();
		System.out.println("The Transaction validation message is :"+ transactionMessage);
		Utilities.waitForElement(VALIDATE_TRANSACTION_MESSAGE_LOCATOR, driver,30);
		Assert.assertEquals(VALIDATE_TRANSACTION_MESSAGE_LOCATOR.getText(), "Transaction Added Successfully", "Transaction Added Successfully message did not display!!!!!!");

	}
	public void validatePageTitle() throws InterruptedException {
		String ContactsTextMessage = VALIDATE_PAGE_TITLE_LOCATOR.getText();
		System.out.println("The Welcome Contacts message is :"+ ContactsTextMessage);
		Utilities.waitForElement(VALIDATE_PAGE_TITLE_LOCATOR, driver,30);
		Assert.assertEquals(VALIDATE_PAGE_TITLE_LOCATOR.getText(), "Transactions", "Transaction Page title did not display!!!!!!");

	}

}
