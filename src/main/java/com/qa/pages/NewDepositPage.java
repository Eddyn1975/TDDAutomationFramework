package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.qa.utils.Utilities;

public class NewDepositPage {
	WebDriver driver;

	public NewDepositPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Transactions')]")
	WebElement TRANSACTION_PAGE_TITLE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='account']")
	WebElement ACCOUNT_SELECT_LOCATOR;
	@FindBy(how = How.CSS, using = "//input[@id='date']")
	WebElement DATE_SELECT_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DESCRIPTION_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='amount']")
	WebElement AMOUNT_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[@id='a_toggle']")
	WebElement ADVANCE_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cats']")
	WebElement CATEGORY_SELECT_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='tags']")
	WebElement TAGS_SELECT_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='payer']")
	WebElement PAYER_SELECT_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='pmethod']")
	WebElement METHOD_SELECT_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='ref']")
	WebElement REF_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SUBMIT_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Transactions')]")
	WebElement VALIDATE_PAGE_TITLE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success fade in']")
	WebElement VALIDATE_TRANSACTION_MESSAGE_LOCATOR;

	// Methods to interact with the elements
	public void validateURL() {
		String expectedURL = "https://techfios.com/billing/?ng=transactions/deposit/";
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("The Current URL is :" + CurrentURL);
		Assert.assertEquals(CurrentURL, expectedURL, "Wrong URL!!!");

	}

	public void validateTransactionTextMessage() throws InterruptedException {
		Utilities.waitForElement(VALIDATE_TRANSACTION_MESSAGE_LOCATOR, driver, 30);
		String ExpectedTextMessage = "×\r\n" + "Transaction Added Successfully";
		String ActualTransactionTextMessage = VALIDATE_TRANSACTION_MESSAGE_LOCATOR.getText();
		System.out.println("The Expected Transaction validation message is :" + ExpectedTextMessage);
		System.out.println("The Actual Transaction validation message is :" + ActualTransactionTextMessage);
		if (ExpectedTextMessage.equalsIgnoreCase(ActualTransactionTextMessage)) {
			System.out.println("True");
		} else
			System.out.println("false");
		/*
		 * Utilities.waitForImplicitlyWait();
		 * Assert.assertEquals(ExpectedTextMessage,ActualTransactionTextMessage,
		 * "Transaction validation message did not display!!!");
		 * Utilities.waitForImplicitlyWait();
		 */
	}

	public void validatePageTitle() throws InterruptedException {
		Utilities.waitForElement(VALIDATE_PAGE_TITLE_LOCATOR, driver, 30);
		String ContactsTextMessage = VALIDATE_PAGE_TITLE_LOCATOR.getText();
		System.out.println("The Page Title message is :" + ContactsTextMessage);
		Assert.assertEquals(VALIDATE_PAGE_TITLE_LOCATOR.getText(), "Transactions",
				"Transaction Page title did not display!!!!!!");

	}

	public void chooseAnAccount() throws InterruptedException {
		Utilities.waitForElement(ACCOUNT_SELECT_LOCATOR, driver, 30);
		Utilities.dropDownList(ACCOUNT_SELECT_LOCATOR, "Checking");
	}

	public void selectDate() throws Exception {
		String expectedmonthyear = "Dec 2022";
		String expectedday = "12";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='date']")).click();
		Thread.sleep(3000);
		while (true) {
			String currentmonthyear = driver.findElement(By.xpath("//li[@data-type='month current']")).getText();
			if (currentmonthyear.equalsIgnoreCase(expectedmonthyear)) {
				break;
			} else {
				driver.findElement(By.xpath("//li[@data-type='month next']")).click();
			}
		}
		driver.findElement(By.xpath("//ul[@class='datepicker-days']//li[contains(text()," + expectedday + ")]"))
				.click();
	}

	public void enterDescription(String description) throws InterruptedException {
		Utilities.waitForElement(DESCRIPTION_FIELD_LOCATOR, driver, 30);
		DESCRIPTION_FIELD_LOCATOR.sendKeys(description);

	}

	public void enterAmount(String amount) throws InterruptedException {
		Utilities.waitForElement(AMOUNT_FIELD_LOCATOR, driver, 30);
		AMOUNT_FIELD_LOCATOR.sendKeys(amount);

	}

	public void clickOnAdavanceButton() throws InterruptedException {
		Utilities.waitForElement(ADVANCE_BUTTON_LOCATOR, driver, 30);
		ADVANCE_BUTTON_LOCATOR.click();
	}

	public void enterCategory() throws InterruptedException {
		Utilities.waitForElement(CATEGORY_SELECT_LOCATOR, driver, 30);
		Utilities.dropDownList(CATEGORY_SELECT_LOCATOR, "Salary");
	}

	public void enterTags() throws InterruptedException {
		Utilities.waitForElement(TAGS_SELECT_LOCATOR, driver, 30);
		Utilities.dropDownList(TAGS_SELECT_LOCATOR, "War");
	}

	public void enterPayerName() throws InterruptedException {
		Utilities.waitForElement(PAYER_SELECT_LOCATOR, driver, 30);
		Utilities.dropDownList(PAYER_SELECT_LOCATOR, "James Bond");
	}

	public void enterMethodName() throws InterruptedException {
		Utilities.waitForElement(METHOD_SELECT_LOCATOR, driver, 30);
		Utilities.dropDownList(METHOD_SELECT_LOCATOR, "Electronic Transfer");
	}

	public void enterReferenceNumber(String referenceNumber) throws InterruptedException {
		Utilities.waitForElement(REF_FIELD_LOCATOR, driver, 30);
		REF_FIELD_LOCATOR.sendKeys(referenceNumber);

	}

	public void clickOnSubmitDepositButton() throws InterruptedException {
		Utilities.waitForElement(SUBMIT_BUTTON_LOCATOR, driver, 30);
		SUBMIT_BUTTON_LOCATOR.click();
	}

}
