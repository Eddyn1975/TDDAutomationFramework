package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.qa.utils.Utilities;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {

		this.driver = driver;

	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Dashboard']")
	WebElement DASHBOARD_ELEMENT_FIELD;

	// Methods to interact with the elements
	public void validateURL() {
		String expectedURL = "https://techfios.com/billing/?ng=dashboard/";
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, expectedURL, "Wrong URL!!!");

	}

	public void verifyDashBoardPageTitleElement() {
		Assert.assertEquals(DASHBOARD_ELEMENT_FIELD.getText(), "Dashboard", "Dashboard title did not display!!!");
	}

}
