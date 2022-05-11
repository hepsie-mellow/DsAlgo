package dsAlgo_TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dsalgo.base.Base;
import com.dsalgo.utils.ExcelUtils;

import dsalgo.pages.DsAlgo_HomePage;
import dsalgo.pages.LoginPage;
import dsalgo.pages.TryEditor;
import graph.pages.GraphPage;
import stack.pages.StackPage;

public class Stack_TestCases extends Base{
	StackPage stack;
	TryEditor TE;
	LoginPage login;
	
	
	@Test(priority=2)
	public void Graph() throws Exception {
		stack = new StackPage();
		
		stack.Implementation_Link();
		TE= stack.tryHere();
		
		//Entering values in the editor and verifying
		String Query =ExcelUtils.getCellData(login.path, "Sheet1", 1, 2);
			TE.editor(Query);
			driver.navigate().back();
			
			
			stack.Operations_Link();
			TE= stack.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
	}	
	
	
	@Test
	public void VerifyStackTitle() {
		String StackPageTitle = driver.getTitle();
		System.out.println("Title of the Stack Page is :" + StackPageTitle);
		Assert.assertEquals(StackPageTitle, "Stack");
	}
	
	@Test(priority=1,description ="This test case will check the no of topics on Stack page")
	public void noOfTopics() {
		List<WebElement> topics =driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total No of Topics on Stack Page :"+" "+topics.size());
		for(int i = 0; i< topics.size(); i++) {
	        
	         String s = topics.get(i).getText();
	         System.out.println("Topics"+" "+i+ " : " + s);
	      }
		System.out.println("--------------------------------------------------------------------");
	}
	
	@Test(priority = 3)
	public void SelectQueueModule() {
		DsAlgo_HomePage home=new DsAlgo_HomePage();
		home.getDropDownBox("Queue");

	}


}
