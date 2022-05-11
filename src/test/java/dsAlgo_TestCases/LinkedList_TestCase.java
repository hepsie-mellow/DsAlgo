package dsAlgo_TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.dsalgo.base.Base;
import com.dsalgo.utils.ExcelUtils;

import dsalgo.pages.DsAlgo_HomePage;
import dsalgo.pages.LoginPage;
import dsalgo.pages.TryEditor;
import linked_list.pages.Linked_ListPage;
import tree.pages.TreePage;

public class LinkedList_TestCase extends Base{
	
	Linked_ListPage linkList;
	TryEditor TE;
	LoginPage login;
	
	
	@Test(priority=2)
	public void LinkedList() throws Exception {
		linkList = new Linked_ListPage();
		
		linkList.Introduction_Link();
		TE= linkList.tryHere();
		
		//Entering values in the editor and verifying
		String Query =ExcelUtils.getCellData(login.path, "Sheet1", 1, 2);
			TE.editor(Query);
			driver.navigate().back();
			
			
			linkList.CreatingLinkedLIst_Link();
			TE= linkList.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			linkList.TypesofLinkedList_Link();
			TE= linkList.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			linkList.ImplementLinkedListPython_Link();
			TE= linkList.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			linkList.Traversal_Link();
			TE= linkList.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			linkList.Insertion_Link();
			TE= linkList.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
			linkList.Deletion_Link();
			TE= linkList.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
			
	

	}
	
	
	@Test
	public void VerifyLinkedListTitle() {
		String TreePageTitle = driver.getTitle();
		System.out.println("Title of the LinkedList Page is :" + TreePageTitle);
		Assert.assertEquals(TreePageTitle, "Linked List");
	}
	
	@Test(priority=1,description ="This test case will check the no of topics on LinkedList page")
	public void noOfTopics() {
		List<WebElement> topics =driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total No of Topics on LinkedList Page :"+" "+topics.size());
		for(int i = 0; i< topics.size(); i++) {
	        
	         String s = topics.get(i).getText();
	         System.out.println("Topics"+" "+i+ " : " + s);
	      }
		System.out.println("--------------------------------------------------------------------");
	}
	
	@Test(priority = 3)
	public void signOut() {
		DsAlgo_HomePage home=new DsAlgo_HomePage();
		home.getSignOut();
		

	}
	
	@AfterClass
	public void TearDown() {
//		driver.close();
		driver.quit();
	}

}
