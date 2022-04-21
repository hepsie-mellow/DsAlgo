package dsAlgo_Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import brower_Utlity.CrossBrowser;
import brower_Utlity.ExcelSheet;
import ds_Algo.pages.DsAlgoStart_Page;
import ds_Algo.pages.LoginPage;
import ds_Algo.pages.Register_Page;

public class Login_Test {
	static ExtentReports extent;
	ExtentSparkReporter spark;
	public static WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("DsAlgo.html");
		extent.attachReporter(spark);
		
	}
	@AfterSuite
	public void afterSuite() {
		extent.flush();
	}
	
	
	@Test(priority=1,description="This testcase will open the browser and click on the getstart button")
	public static void startPage() throws InterruptedException {
		ExtentTest test = extent.createTest("startPage");
		test.log(Status.INFO, "Launching edge browser");
		driver=CrossBrowser.startBrowser("edge", "https://dsportalapp.herokuapp.com/");
		DsAlgoStart_Page home =PageFactory.initElements(driver, DsAlgoStart_Page.class);
		DsAlgoStart_Page.homePage();
		
	}
		
	@Test(priority=2)
	public static void excel() throws IOException {
		ExcelSheet excel = PageFactory.initElements(driver, ExcelSheet.class);
		excel.excel();
	}
	
//		@Test(priority=3,description="This testcase will enter the username and password in the register page")
//		public static void verifyRegister() throws InterruptedException, IOException {
//		Register_Page reg =PageFactory.initElements(driver, Register_Page.class);
//		Register_Page.excel();
//		Register_Page.login();
////		Register_Page.register();
//		}
	@Test(priority=3)
	public static void verifyLogin() throws IOException {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.login();
	}

	

}
