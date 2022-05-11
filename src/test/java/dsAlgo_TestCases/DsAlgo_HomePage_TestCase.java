package dsAlgo_TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dsalgo.base.Base;
import com.dsalgo.utils.ExcelUtils;

import datastructure.pages.DataStructurePage;
import datastructure.pages.TimeComplexity;
import dsalgo.pages.DsAlgoStart_Page;
import dsalgo.pages.DsAlgo_HomePage;
import dsalgo.pages.LoginPage;
import dsalgo.pages.TryEditor;

public class DsAlgo_HomePage_TestCase extends Base {
	DsAlgoStart_Page start;
	LoginPage login;
	DsAlgo_HomePage home;
	DataStructurePage DS;
	TimeComplexity TC;
	TryEditor TE;
	
	public DsAlgo_HomePage_TestCase(){
		super();
	}
	
	
//	@Test(priority=0,description="This testcase will open the browser and click on the getstart button and login")
	public void setUp() throws IOException, InterruptedException {
//		startBrowser();
		start =new DsAlgoStart_Page();
		home= start.startPage();
		String uname=ExcelUtils.getCellData(login.path, "Sheet1", 1, 0);
		String pword=ExcelUtils.getCellData(login.path, "Sheet1", 1, 1);
		login.login(uname,pword);
		
	}
		
	@Test(priority=1,description = "This testcase will verify the title of the home page")
	public void verifyHomepageTitle() {
		String HomeTitle = driver.getTitle();
		System.out.println("Title of the Home Page is :" + HomeTitle);
		Assert.assertEquals(HomeTitle, "NumpyNinja");
		
	}
	@Test(priority=2,description = "This testcase will verify the number of modules present in the home page")
	public void totalModules() throws Exception {
		home =new DsAlgo_HomePage();
//		home.noOfModules();
		List<WebElement> modules =driver.findElements(By.xpath("//h5[@class='card-title']"));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total No of Modules on Home Page :"+" "+modules.size());
		for(int i = 0; i< modules.size(); i++) {
	        
	         String s = modules.get(i).getText();
	         System.out.println("Module"+" "+i+ " : " + s);
	      }
		System.out.println("--------------------------------------------------------------------");
	}
	
	
	

}
