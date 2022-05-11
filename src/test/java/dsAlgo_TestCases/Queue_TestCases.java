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
import queue.pages.QueuePage;
import stack.pages.StackPage;

public class Queue_TestCases extends Base {
	QueuePage queue;
	TryEditor TE;
	LoginPage login;
	
	
	@Test(priority=2)
	public void Graph() throws Exception {
		queue = new QueuePage();
		
		queue.ImplementationQueue_Link();
		TE= queue.tryHere();
		
		//Entering values in the editor and verifying
		String Query =ExcelUtils.getCellData(login.path, "Sheet1", 1, 2);
			TE.editor(Query);
			driver.navigate().back();
			
			
			queue.Implementation_collection_Link();
			TE= queue.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			queue.ImplementArray_Link();
			TE= queue.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			queue.QueueOperations_Link();
			TE= queue.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
	}	
	
	
	@Test
	public void VerifyQueueTitle() {
		String QueuePageTitle = driver.getTitle();
		System.out.println("Title of the Queue Page is :" + QueuePageTitle);
		Assert.assertEquals(QueuePageTitle, "Queue");
	}
	
	@Test(priority=1,description ="This test case will check the no of topics on Queue page")
	public void noOfTopics() {
		List<WebElement> topics =driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total No of Topics on Queue Page :"+" "+topics.size());
		for(int i = 0; i< topics.size(); i++) {
	        
	         String s = topics.get(i).getText();
	         System.out.println("Topics"+" "+i+ " : " + s);
	      }
		System.out.println("--------------------------------------------------------------------");
	}
	
	@Test(priority = 3)
	public void SelectQueueModule() {
		DsAlgo_HomePage home=new DsAlgo_HomePage();
		home.getDropDownBox("Tree");

	}


}
