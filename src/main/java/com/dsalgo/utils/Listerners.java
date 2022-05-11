package com.dsalgo.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.dsalgo.base.Base;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;

public class Listerners extends Base implements ITestListener{
	
	ExtentReports extent =ExtentReportsFile.extentReport();
	ExtentTest test;
	private static ThreadLocal<ExtentTest> safe = new ThreadLocal<ExtentTest>();
	

	
	

	public void onTestStart(ITestResult result) {
		Capabilities browserCap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = browserCap.getBrowserName();
		test=extent.createTest(result.getMethod().getMethodName()+" "+browserName);
		safe.set(test);	
//		saveLogsAllure(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		
		safe.get().log(Status.PASS, "Successfully Done");
		Object testObject = result.getInstance();
		Class classname =result.getTestClass().getRealClass();
		Capabilities browserCap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = browserCap.getBrowserName();
//		saveLogsAllure(result.getMethod().getMethodName());
////		System.out.println("browser"+browserName);
//		try {
//			driver =(WebDriver)classname.getDeclaredField("driver").get(testObject);
//		} catch (Exception e1) {
//			
//			e1.printStackTrace();
//		}
//		try {
//			safe.get().addScreenCaptureFromPath(getScreenshotpath(result.getMethod().getMethodName()),result.getMethod().getMethodName()+" "+browserName);
//			
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}

	
		
	}

	public void onTestFailure(ITestResult result) {
//		WebDriver driver = null;
		
		Object testObject = result.getInstance();
		Class classname =result.getTestClass().getRealClass();
		Capabilities browserCap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = browserCap.getBrowserName();
//		System.out.println("browser"+browserName);
//		try {
//			driver =(WebDriver)classname.getDeclaredField("driver").get(testObject);
//		} catch (Exception e1) {
//			
//			e1.printStackTrace();
//		}
		try {
			safe.get().addScreenCaptureFromPath(getScreenshotpath(result.getMethod().getMethodName()),result.getMethod().getMethodName()+" "+browserName);
//			Allure.addAttachment(UUID.randomUUID().toString(),
//					//new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
//					new ByteArrayInputStream(getScreenshotpath(result.getMethod().getMethodName())));
			saveScreenshotAllure(Base.driver);
//			saveLogsAllure(result.getMethod().getMethodName());

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		safe.get().fail(result.getThrowable());
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
		
	}
	
	@Attachment(value="screenshot", type="image/png")
	public byte[] saveScreenshotAllure(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
	}
	
	@Attachment(value="Stackrace", type="message")
	public static String saveLogsAllure(String message) {
		return message;
	}
	
	
	
	
	

}
