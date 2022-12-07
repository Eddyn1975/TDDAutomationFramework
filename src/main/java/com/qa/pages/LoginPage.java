package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.qa.utils.Utilities;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]")
	WebElement SIGN_IN_BUTTON;
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-danger fade in']")
	WebElement ERROR_MESSAGE_FIELD;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Forgot password ?']")
	WebElement FORGOT_PASSWORD;
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement EMAIL_ADDRESS_FIELD;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Reset Password']")
	WebElement RESET_PASSWORD_BUTTON;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Back To Login']")
	WebElement BACK_TO_LOGIN_BUTTON;

	// Methods to interact with the elements

	public void enterUserName(String userName) {
		Utilities.waitForElement(USERNAME_FIELD, driver,30);
		USERNAME_FIELD.sendKeys(userName);
		
	}

	public void enterPassword(String password) {
		Utilities.waitForElement(PASSWORD_FIELD, driver,30);
		PASSWORD_FIELD.sendKeys(password);
		
	}

	public void clickSignInButton() throws InterruptedException {
		Utilities.threadsleep(2000);
		SIGN_IN_BUTTON.click();
		Utilities.threadsleep(2000);
		
	}

	public void verifyErrorMessageForInvalidLogin() {
		// String expectedErrorMessage = ERROR_MESSAGE_FIELD.getText();
		// System.out.println(expectedErrorMessage);
		Assert.assertEquals(ERROR_MESSAGE_FIELD.getText(), "× Invalid Username or Password",
				"Wrong Error Text Message!!!");
		Utilities.waitForElement(ERROR_MESSAGE_FIELD, driver,30);
	}

	public void validateURL() {
		String CurrentURL = "https://techfios.com/billing/?ng=login/";
		String expectedURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, expectedURL, "Wrong URL!!!");

	}

}
