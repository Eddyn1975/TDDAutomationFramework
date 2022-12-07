package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import com.qa.utils.Utilities;

public class NewInvoicePage {
	static WebDriver driver;
	public NewInvoicePage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]")
	WebElement SIGN_IN_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Add Invoice']")
	WebElement VALIDATE_ADD_INVOICE_PAGE_TITLE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@class='redactor-editor redactor-linebreaks']")
	WebElement ITEM_NAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@placeholder='Invoice Terms...']")
	WebElement INVOICE_TERMS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='qty[]']")
	WebElement QTY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='amount[]']")
	WebElement PRICE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@name='taxed[]']")
	WebElement TAX_SELECT_DRODOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[@id='contact_add']")
	WebElement ADD_NEW_CUSTOMER_LINK_LOCATOR;
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Add New Contact')]")
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
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_POSTALCODE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_DROPDOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@id='contact_submit']")
	WebElement ADD_CONTACT_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Michael')]")
	WebElement CUSTOMER_DROPDOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='currency']")
	WebElement CURRENCY_DROPDOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='invoicenum']")
	WebElement INVOICE_PREFIX_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "")
	WebElement INVOICE_DATE_PICKER_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='duedate']")
	WebElement PAYMENT_TERMS_DROPDOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='tid'] ")
	WebElement SALES_TAX_DROPDOWN_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[@id='add_discount']")
	WebElement SET_DISCOUNT_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Set Discount')]")
	WebElement VALIDATE_SET_DISCOUNT_PAGE_TITLE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='set_discount']")
	WebElement DISCOUNT_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='set_discount_type-0']")
	WebElement DISCOUNT_TYPE_CHECKBOX_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@type='button'][normalize-space()='Save']")
	WebElement SAVE_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_INVOICE_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@id='save_n_close']")
	WebElement SAVE_AND_CLOSE_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Invoices')]")
	WebElement VALIDATE_INVOICE_PAGE_TITLE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@id='item-add']")
	WebElement ADD_PRODUCT_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//td[text()='Samsung TV']//preceding-sibling::td//input")
	WebElement SELECT_PRODUCT_CHECKBOX_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Select']")
	WebElement SELECT_BUTTON_LOCATOR;

	// Methods to interact with the elements
	public NewInvoicePage enterUserName(String userName) {
		Utilities.waitForElement(USERNAME_FIELD_LOCATOR, driver, 30);
		USERNAME_FIELD_LOCATOR.sendKeys(userName);
		return this;
	}

	public NewInvoicePage enterPassword(String password) {
		Utilities.waitForElement(PASSWORD_FIELD_LOCATOR, driver, 30);
		PASSWORD_FIELD_LOCATOR.sendKeys(password);
		return this;
	}

	public void clickSignInButton() throws InterruptedException {
		Utilities.waitForElement(SIGN_IN_BUTTON_LOCATOR, driver, 30);
		SIGN_IN_BUTTON_LOCATOR.click();

	}

	public void validateURL() {
		String expectedURL = "https://techfios.com/billing/?ng=invoices/add/";
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("The Current URL is :" + CurrentURL);
		Assert.assertEquals(CurrentURL, expectedURL, "Wrong URL!!!");
	}

	public NewInvoicePage enterItemName(String itemName) throws InterruptedException {
		Utilities.threadsleep(2000);
		try {
			ITEM_NAME_FIELD_LOCATOR.sendKeys(itemName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;

	}

	public NewInvoicePage enterInvoiceTerms(String invoiceTerms) throws InterruptedException {
		Utilities.waitForElement(INVOICE_TERMS_FIELD_LOCATOR, driver, 30);
		INVOICE_TERMS_FIELD_LOCATOR.sendKeys(invoiceTerms);
		return this;

	}

	String qty = "2";

	public void enterQuantity() throws InterruptedException {
		Utilities.waitForElement(QTY_FIELD_LOCATOR, driver, 30);
		QTY_FIELD_LOCATOR.sendKeys(qty);

	}

	public NewInvoicePage enterPrice(String price) throws InterruptedException {
		Utilities.waitForElement(PRICE_FIELD_LOCATOR, driver, 30);
		PRICE_FIELD_LOCATOR.sendKeys(price);
		return this;

	}

	public NewInvoicePage addProduct(String product) throws InterruptedException {
		Utilities.waitForElement(ADD_PRODUCT_BUTTON_LOCATOR, driver, 30);
		ADD_PRODUCT_BUTTON_LOCATOR.sendKeys(product);
		return this;

	}

	public NewInvoicePage selectProduct(String selectProduct) throws InterruptedException {
		Utilities.waitForElement(SELECT_PRODUCT_CHECKBOX_LOCATOR, driver, 30);
		SELECT_PRODUCT_CHECKBOX_LOCATOR.sendKeys(selectProduct);
		return this;

	}

	public NewInvoicePage clickOnSelectProductButton() throws InterruptedException {
		Utilities.waitForElement(SELECT_BUTTON_LOCATOR, driver, 30);
		SELECT_BUTTON_LOCATOR.click();
		return this;

	}

	public void selectTax() throws InterruptedException {
		Utilities.waitForElement(TAX_SELECT_DRODOWN_LIST_LOCATOR, driver, 30);
		Utilities.dropDownList(TAX_SELECT_DRODOWN_LIST_LOCATOR, "Yes");
	}

	public void clickOnAddNewCustomer() throws InterruptedException {
		Utilities.threadsleep(2000);
		try {
			ADD_NEW_CUSTOMER_LINK_LOCATOR.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyAddNewContactPageTitle() throws InterruptedException {
		Utilities.threadsleep(2000);
		Assert.assertEquals(VALIDATE_ADD_NEW_CONTACT_PAGE_TITLE_LOCATOR.getText(), "Add New Contact",
				"Add New Contact page title did not display!!!");
	}

	public NewInvoicePage enterFullName(String fullname) throws InterruptedException {
		fullname = fullname + Utilities.randomNumGenerator();
		Utilities.waitForElement(FULLNAME_FIELD_LOCATOR, driver, 30);
		FULLNAME_FIELD_LOCATOR.sendKeys(fullname);
		return this;
	}

	public NewInvoicePage enterCompanyName(String companyName) throws InterruptedException {
		Utilities.waitForElement(COMPANYNAME_FIELD_LOCATOR, driver, 30);
		COMPANYNAME_FIELD_LOCATOR.sendKeys(companyName);
		return this;
	}

	public NewInvoicePage enterEmailAddress(String emailAddress) throws InterruptedException {
		emailAddress = emailAddress + Utilities.randomNumGenerator();
		Utilities.waitForElement(EMAIL_FIELD_LOCATOR, driver, 30);
		EMAIL_FIELD_LOCATOR.sendKeys(emailAddress);
		return this;
	}

	public NewInvoicePage enterPhoneNumber(String phoneNumber) throws InterruptedException {
		phoneNumber = phoneNumber + Utilities.randomNumGenerator();
		Utilities.waitForElement(PHONE_FIELD_LOCATOR, driver, 30);
		PHONE_FIELD_LOCATOR.sendKeys(phoneNumber);
		return this;
	}

	public NewInvoicePage enterAddress(String address) throws InterruptedException {
		Utilities.waitForElement(ADDRESS_FIELD_LOCATOR, driver, 30);
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
		return this;
	}

	public NewInvoicePage enterCity(String city) throws InterruptedException {
		Utilities.waitForElement(CITY_FIELD_LOCATOR, driver, 30);
		CITY_FIELD_LOCATOR.sendKeys(city);
		return this;
	}

	public NewInvoicePage enterStateRegion(String stateregion) throws InterruptedException {
		Utilities.waitForElement(STATE_REGION_FIELD_LOCATOR, driver, 30);
		STATE_REGION_FIELD_LOCATOR.sendKeys(stateregion);
		return this;
	}

	public NewInvoicePage enterZipCode(String zipcode) throws InterruptedException {
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

	public void selectCustomer() throws InterruptedException {
		Utilities.waitForElement(CUSTOMER_DROPDOWN_LIST_LOCATOR, driver, 30);
		CUSTOMER_DROPDOWN_LIST_LOCATOR.click();
	}

	public void selectCurrency() throws InterruptedException {
		Utilities.threadsleep(2000);
		try {
			Utilities.dropDownList(CURRENCY_DROPDOWN_LIST_LOCATOR, "USD");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  String invoiceprefix = "invoice#";
	public void enterInvoicePrefix() throws InterruptedException {
		try {
			Utilities.waitForElement(INVOICE_PREFIX_FIELD_LOCATOR, driver, 30);
			INVOICE_PREFIX_FIELD_LOCATOR.sendKeys(invoiceprefix);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void windowScrollDown() throws InterruptedException {
		Utilities.threadsleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,2000)");

	}

	public void selectInvoiceDate() throws Exception {
		String expectedmonthyear = "Dec 2022";
		String expectedday = "12";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='idate']")).click();
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

	public void selectPaymentTerms() throws InterruptedException {
		Utilities.threadsleep(2000);
		Utilities.dropDownListByValue(PAYMENT_TERMS_DROPDOWN_LIST_LOCATOR, "days10");
	}

	public void selectSalesTax() throws InterruptedException {
		Utilities.threadsleep(2000);
		Utilities.dropDownListByValue(SALES_TAX_DROPDOWN_LIST_LOCATOR, "1");
	}

	public void clickOnSetDiscount() throws InterruptedException {
		Utilities.threadsleep(2000);
		SET_DISCOUNT_BUTTON_LOCATOR.click();
	}

	public void verifySetDiscountPageTitle() {
		Assert.assertEquals(VALIDATE_SET_DISCOUNT_PAGE_TITLE_LOCATOR.getText(), "Set Discount",
				"Set Discount page title did not display!!!");
	}

	public NewInvoicePage enterDiscount(String discount) throws InterruptedException {
		Utilities.waitForElement(DISCOUNT_FIELD_LOCATOR, driver, 30);
		DISCOUNT_FIELD_LOCATOR.sendKeys(discount);
		return this;

	}

	public void selectDiscountType() throws InterruptedException {
		Utilities.waitForElement(DISCOUNT_TYPE_CHECKBOX_LOCATOR, driver, 30);
		DISCOUNT_TYPE_CHECKBOX_LOCATOR.click();
	}

	public void clickOnSaveButton() throws InterruptedException {
		Utilities.threadsleep(2000);
		SAVE_BUTTON_LOCATOR.click();
	}

	public void windowScrollUp() throws InterruptedException {
		Utilities.threadsleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,-2000)");

	}

	public void clickOnSaveInvoiceButton() throws InterruptedException {
		Utilities.threadsleep(2000);
		try {
			SAVE_INVOICE_BUTTON_LOCATOR.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnSaveAndCloseButton() throws InterruptedException {
		Utilities.threadsleep(2000);
		try {
			SAVE_AND_CLOSE_BUTTON_LOCATOR.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyInvoicesPageTitle() throws InterruptedException {
		Utilities.threadsleep(2000);
		Assert.assertEquals(VALIDATE_INVOICE_PAGE_TITLE_LOCATOR.getText(), "Invoices",
				" Invoices page title did not display!!!");
	}

	public void isDataMatching() {

		String before_xpath = "//tbody/tr[";
		String after_xpath = "]/td[3]";
		String expectedAmount = driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
		int countRows = driver.findElements(By.xpath("//tbody//tr/td")).size();
		System.out.println("The number of rows in a table is :" + countRows);

		for (int i = 1; i <= countRows; i++) {
			String actualAmount = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			if (actualAmount.contains(expectedAmount)) {
				driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText();
				System.out.println("The actual amount is: " + actualAmount);
				break;
			} else {

				System.out.println("The amount does not match");
				break;

			}
		}

	}
}
