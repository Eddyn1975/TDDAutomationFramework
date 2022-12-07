package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.utils.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties property;
	public static InputStream inputStream;
	static Logger log = LogManager.getLogger(BaseTest.class.getName());
	public static WebDriver launchBrowser() throws IOException, InterruptedException {

		property = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//resources//config.properties");

		property.load(fis);

		String browserName = property.getProperty("Browser");
		System.out.println("The Browser name is :" + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().cachePath("Drivers").setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().cachePath("Drivers").setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("MicrosoftEdge")) {
			WebDriverManager.edgedriver().cachePath("Drivers").setup();
			driver = new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("InternetExplorer")) {
			WebDriverManager.iedriver().cachePath("Drivers").setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(property.getProperty("URL"));
		log.info("Navigate to home page");
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Utilities.waitForImplicitlyWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//Reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//Reports//" + testCaseName + ".png";
	}

}
