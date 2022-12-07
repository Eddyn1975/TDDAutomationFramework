package com.qa.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	static ExtentReports extent;

	public static ExtentReports getReporter() {
		String filePath = System.getProperty("user.dir") + "//Reports//ExtentReport.html";
		// ExtentHtmlReporter reporter = new ExtentHtmlReporter();
		ExtentSparkReporter reporter = new ExtentSparkReporter(filePath);
		reporter.config().setReportName("Web User Interface Automation Results");
		reporter.config().setDocumentTitle("Automation Test Results");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Automation Engineer", "Eddy Nziraguhindwa");
		extent.createTest(filePath);
		return extent;
	}

}
