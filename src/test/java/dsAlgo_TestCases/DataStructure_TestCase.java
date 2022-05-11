package dsAlgo_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dsalgo.base.Base;
import com.dsalgo.utils.ExcelUtils;

import datastructure.pages.DataStructurePage;
import datastructure.pages.TimeComplexity;
import dsalgo.pages.DsAlgoStart_Page;
import dsalgo.pages.DsAlgo_HomePage;
import dsalgo.pages.LoginPage;
import dsalgo.pages.TryEditor;

public class DataStructure_TestCase extends Base {
	DsAlgoStart_Page start;
	LoginPage login;
	DsAlgo_HomePage home;
	DataStructurePage DS;
	TimeComplexity TC;
	TryEditor TE;
	
	public DataStructure_TestCase(){
		super();
	}
	
	@Test(priority=0,description="This testcase will take you the flow of the data structure page")
	public void dataStructure() throws Exception {
		//object for Home Page
		home =new DsAlgo_HomePage();

		//clicking the Get start button on Home Page
		DS =home.getDsGetstartButton();
		
		//Verifying the title for the Data structure Page
		String DSPageTitle = DS.VerifyTitle();
		System.out.println("Title of the Data Structure Page is :" + DSPageTitle);
		Assert.assertEquals(DSPageTitle, "Data Structures-Introduction");
		
		//Clicking on the Time complexity link on the data structure page
		TC=DS.getTimeComplexLink();
		
		//Verifying the title of the Time Complexity page
		String TCPageTitle = TC.VerifyTitle();
		System.out.println("Title of the TimeComplexity Page is :" + TCPageTitle);
		Assert.assertEquals(TCPageTitle, "Time Complexity");
		
		
		//Clicking the try here button on TimeComplexity Page
		TE=TC.TryhereButton();
		
		//Verifying the title of the Try Editor Page
		String TEPageTitle = TE.VerifyTitle();
		System.out.println("Title of the TryEditor Page is :" + TEPageTitle);
		Assert.assertEquals(TEPageTitle, "Assessment");
		
		//Entering values in the editor and verifying
		String Query =ExcelUtils.getCellData(login.path, "Sheet1", 1, 2);
		TE.editor(Query);
		
		
	}
	
	@Test(priority=1, description="navaigating back and choosing a module Array")	
	public void selectArrayModule() {
		driver.navigate().back();
		home.getDropDownBox("Arrays");
		
	}

}
