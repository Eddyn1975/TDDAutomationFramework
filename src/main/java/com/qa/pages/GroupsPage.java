package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.qa.utils.Utilities;

public class GroupsPage {
	WebDriver driver;

	public GroupsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Contacts')]")
	WebElement CONTACTS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Selenium')]//parent::*//i[@class='fa fa-bars']")
	WebElement LIST_CONTACT_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Volodymyr Zelenskyy')]//parent::td//following-sibling::*//a/i[@class='fa fa-trash']")
	WebElement DELETE_CUSTOMER_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK')]")
	WebElement OK_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success fade in']//child::i[@class='fa-fw fa fa-check']")
	WebElement CUSTOMER_CONTACT_MESSAGE_DELETED_SUCCESSFULLY_LOCATOR;

	// Methods to interact with the elements
	public void validateURL() {
		String expectedURL = "https://techfios.com/billing/?ng=contacts/groups/";
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, expectedURL, "Wrong URL!!!");

	}

	public void verifyContactsPageTitleElement() throws InterruptedException {
		Utilities.threadsleep(2000);
		Assert.assertEquals(CONTACTS_ELEMENT.getText(), "Contacts", "Wrong page!!!");

	}

	public void ClickOnListContactButton() throws InterruptedException {
		Utilities.threadsleep(2000);
		LIST_CONTACT_BUTTON_LOCATOR.click();

	}

	
	
	public void isDataMatching() {

		String expectedName = "Volodymyr Zelenskyy";
		boolean namestatus = false;
		List<WebElement> nameData = driver.findElements(By.xpath("//tbody//descendant::*//td"));
		System.out.println("The Total number of data is: " + "" + nameData.size());
		for (WebElement ele : nameData) {
			String value = ele.getText();
			if (value.contains(expectedName)) {
				namestatus = true;
				System.out.println("The name exist in a table");
				break;
			}
		}
		Assert.assertTrue(namestatus, "The name  does not exist in a table");
	}

	public void ClickOnDeleteButton() throws InterruptedException {
		Utilities.threadsleep(2000);
		DELETE_CUSTOMER_BUTTON_LOCATOR.click();

	}
	public void ClickOnOKButton() throws InterruptedException {
		Utilities.threadsleep(2000);
		OK_BUTTON_LOCATOR.click();

	}
	
	public void verifyCustomerContactDeletionElement() {
		Assert.assertEquals(CUSTOMER_CONTACT_MESSAGE_DELETED_SUCCESSFULLY_LOCATOR.getText(),
				"×\r\n" + "Contact Deleted Successfully", "Wrong Title Message!!!");
	}
	/*
	 * String ListCustomerAccountDeleted; public void
	 * validateCustomerContactDeletedFromTheTopOfTheTable() {
	 * ListCustomerAccountDeleted =
	 * CUSTOMER_CONTACT_MESSAGE_DELETED_SUCCESSFULLY_LOCATOR.getText();
	 * System.out.println("The title message is :"+ ListCustomerAccountDeleted); }
	 */

}
