package com.dsalgo.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	static Properties prop;
	static String configPath ="C:\\Users\\hepsi\\eclipse-workspace\\DS_Algo\\src\\main\\java\\dsalgo_config\\dsalogo_config.properties";
	
	public Base() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream(configPath);
			prop.load(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@Parameters("browser")	
	@BeforeTest
	public  WebDriver crossBrowser(String browser) throws InterruptedException {
//		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("Edge"))
		{
			try {
//			System.setProperty("webdriver.edge.driver", "C:\\Hepsie\\Web_driver\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			try {
			System.setProperty("webdriver.chrome.driver", "C:\\Hepsie\\Web_driver\\chromedriver.exe");
//			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			}
			catch(Exception e){

				e.printStackTrace();
				
			}
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			try {
			System.setProperty("webdriver.gecko.driver", "C:\\Hepsie\\Web_driver\\geckodriver.exe");
//			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			}
			catch(Exception e) {
//				test.log(Status.FAIL, "Failed to launch Firefox driver");
				e.printStackTrace();
				
			}
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			
		return driver;
			
			
		
	}
	
	public static WebDriver getdrver() {
		return driver;
	}
	
	
	public String getScreenshotpath(String TestcaseName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\reports\\"+TestcaseName+".png";
		File dest= new File(path);
		FileUtils.copyFile(src, dest);
		return path;
	}
	

}
