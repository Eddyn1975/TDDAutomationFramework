package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.qa.utils.Utilities;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library



	// Methods to interact with the elements

	public void validateURL() {
		String CurrentURL = "https://techfios.com/billing/?ng=login/";
		String expectedURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, expectedURL, "Wrong URL!!!");

	}

	public void RefreshURL() {
		driver.navigate().to("https://techfios.com/billing/?ng=login/");

	}

}
