package com.qa.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class Utilities {
	static WebDriver driver;
	public static Properties property;
	static Faker faker;

	public static Logger log() {
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}

	public static String getdateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		return dateFormat.format(date);
	}

	public static void waitForElement(WebElement element, WebDriver driver, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static WebElement waitForElementWithfluentWait(WebDriver driver, final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}

		});
		return element;
	}

	public static void waitForElementToBeClickable(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void isDataPresent(WebDriver driver, String beforexpath, String afterxpath, String countRowsxpath,
			String lookupData) {
		String before_xpath = beforexpath;
		String after_xpath = afterxpath;
		int countRows = driver.findElements(By.xpath(countRowsxpath)).size();
		System.out.println("The number of rows in a table is :" + countRows);

		for (int i = 1; i <= countRows; i++) {
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			if (name.contains(lookupData)) {
				driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
				System.out.println("The look up data is : " + name);
				break;
			} else {
				System.out.println("The look up data is missing in the table");
				break;
			}
		}

	}

	public static int randomNumGenerator() {
		Random rnd = new Random();
		int randomNum = rnd.nextInt(999);
		return randomNum;
	}

	public static void waitForImplicitlyWait(WebDriver driver, int timeout) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);

	}

	public static void windowScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,8000)");
	}

	public static void windowScrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,-8000)");
	}

	public static void dropDownList(WebElement locator, String visibleText) {
		Select select = new Select(locator);
		select.selectByVisibleText(visibleText);
	}

	public static void dropDownListByIndex(WebElement locator, int index) {
		Select select = new Select(locator);
		select.selectByIndex(index);
	}

	public static void dropDownListByValue(WebElement locator, String value) {
		Select select = new Select(locator);
		select.selectByValue(value);
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public static void threadsleep(int timeout) throws InterruptedException {
		Thread.sleep(timeout);
	}

	public void dataFaker() {
		Faker faker = new Faker();
		// To generate valid random first name
		String FirstName = faker.name().firstName();
		// To generate valid random last name
		String LastName = faker.name().lastName();
		// To generate valid Street number
		String StreetNumber = faker.address().streetAddressNumber();
		// To generate valid Street name
		String StreetName = faker.address().streetName();
		// To generate valid random city name
		String City = faker.address().cityName();
		// To generate valid random state name
		String Address = faker.address().state();
		// To generate valid Zip code
		String ZipCode = faker.address().zipCode();
		// To generate valid random country name
		String Country = faker.address().country();
		// To generate valid random cell number
		String PhoneNumber = faker.phoneNumber().cellPhone();
		// To generate valid Company name
		String Company = faker.company().name();
		// To generate valid email address
		String Email = faker.internet().emailAddress();
		// To generate valid Company name
		String JobTitle = faker.job().title();
		// To generate valid password
		String Password = faker.internet().password();
		// To generate valid random number
		int RandomNumber = (faker.number().numberBetween(1, 999));
	}
}
