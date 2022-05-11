package dsAlgo_TestCases;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.dsalgo.base.Base;
import com.dsalgo.utils.ExcelUtils;

import dsalgo.pages.DsAlgoStart_Page;
import dsalgo.pages.DsAlgo_HomePage;
import dsalgo.pages.LoginPage;
import dsalgo.pages.Register_Page;

public class Login_Test extends Base{
	
		
	@Test(priority=1, description ="This test case will verify login with username and password")
	public static void verifyLogin() throws IOException, InterruptedException {
//		home= new DsAlgo_HomePage();
//		home.Signinlink.click();
	
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		//Verifying the login page title
			String LoginPageTitle = login.VerifyTitle();
			System.out.println("Title of the Login Page is :" + LoginPageTitle);
			Assert.assertEquals(LoginPageTitle, "Login");
			System.out.println("--------------------------------------------------------------");
			
		//reading username and password  from the excel sheet
		String uname=ExcelUtils.getCellData(login.path, "Sheet1", 1, 0);
		String pword=ExcelUtils.getCellData(login.path, "Sheet1", 1, 1);
		login.login(uname,pword);
	}
	

}
