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
import tree.pages.TreePage;

public class Tree_TestCases extends Base{
	
	TreePage tree;
	TryEditor TE;
	LoginPage login;
	
	
	@Test(priority=2)
	public void Tree() throws Exception {
		tree = new TreePage();
		
		tree.OverviewofTrees_Link();
		TE= tree.tryHere();
		
		//Entering values in the editor and verifying
		String Query =ExcelUtils.getCellData(login.path, "Sheet1", 1, 2);
			TE.editor(Query);
			driver.navigate().back();
			
			
			tree.Terminologies_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			tree.TypesofTrees_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			tree.TreeTraversals_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			tree.TraversalsIllustration_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			tree.BinaryTrees_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			tree.TypesofBinaryTrees_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			tree.BinaryTreeTraversals_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			tree.ImplementationofBinaryTrees_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			tree.ApplicationsofBinarytrees_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			tree.BinarySearchTrees_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
						
			tree.ImplementationOfBST_Link();
			TE= tree.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
	}	
	
	
	
	@Test
	public void VerifyTreeTitle() {
		String TreePageTitle = driver.getTitle();
		System.out.println("Title of the Tree Page is :" + TreePageTitle);
		Assert.assertEquals(TreePageTitle, "Tree");
	}
	
	@Test(priority=1,description ="This test case will check the no of topics on Tree page")
	public void noOfTopics() {
		List<WebElement> topics =driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total No of Topics on Tree Page :"+" "+topics.size());
		for(int i = 0; i< topics.size(); i++) {
	        
	         String s = topics.get(i).getText();
	         System.out.println("Topics"+" "+i+ " : " + s);
	      }
		System.out.println("--------------------------------------------------------------------");
	}
	
	@Test(priority = 3)
	public void SelectQueueModule() {
		DsAlgo_HomePage home=new DsAlgo_HomePage();
		home.getDropDownBox("Linked List");

	}



}
