package dsAlgo_TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dsalgo.base.Base;
import com.dsalgo.utils.ExcelUtils;

import array.pages.ArrayHomePage;
import dsalgo.pages.DsAlgo_HomePage;
import dsalgo.pages.LoginPage;
import dsalgo.pages.TryEditor;

public class Array_TestCases extends Base{
	ArrayHomePage array;
	TryEditor TE;
	LoginPage login;
	DsAlgo_HomePage home;
	
	Array_TestCases(){
		super();
	}
	
	
	@Test(priority=2)
	public void Array() throws Exception {
		array=new ArrayHomePage();
		
		array.getApplicationsArray_Link();
		TE= array.tryHere();
		
		//Entering values in the editor and verifying
		String Query =ExcelUtils.getCellData(login.path, "Sheet1", 1, 2);
			TE.editor(Query);
			driver.navigate().back();
			
			
			array.getArraysUsing_Link();
			TE= array.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			array.getArrayIn_Link();
			TE= array.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			array.getBasicOperations_Link();
			TE= array.tryHere();
			
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
				
		
	}
	
	@Test
	public void VerifyArrayTitle() {
		String ArrayPageTitle = driver.getTitle();
		System.out.println("Title of the Array Page is :" + ArrayPageTitle);
		Assert.assertEquals(ArrayPageTitle, "Array");
	}
	
	
	@Test(priority=1,description ="This test case will check the no of topics on Array page")
	public void noOfTopics() {
		List<WebElement> topics =driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total No of Topics on Array Page :"+" "+topics.size());
		for(int i = 0; i< topics.size(); i++) {
	        
	         String s = topics.get(i).getText();
	         System.out.println("Topics"+" "+i+ " : " + s);
	      }
		System.out.println("--------------------------------------------------------------------");
	}
	
	@Test(priority = 3)
	public void SelectGraphModule() {
		home=new DsAlgo_HomePage();
		home.getDropDownBox("Graph");

	}
}
