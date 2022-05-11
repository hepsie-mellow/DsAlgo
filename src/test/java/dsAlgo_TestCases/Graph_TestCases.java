package dsAlgo_TestCases;

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
import graph.pages.GraphPage;

public class Graph_TestCases extends Base {
	GraphPage graph;
	TryEditor TE;
	LoginPage login;
	
	Graph_TestCases(){
		super();
	}

	@Test(priority=2)
	public void Graph() throws Exception {
		graph=new GraphPage();
		
		graph.getGraph_Link();
		TE= graph.tryHere();
		
		//Entering values in the editor and verifying
		String Query =ExcelUtils.getCellData(login.path, "Sheet1", 1, 2);
			TE.editor(Query);
			driver.navigate().back();
			
			
			graph.getGraphRepsrnt_Link();
			TE= graph.tryHere();
			//Entering values in the editor and verifying
			TE.editor(Query);
			driver.navigate().back();
	}	
	
	
	@Test
	public void VerifyGraphTitle() {
		String GraphPageTitle = driver.getTitle();
		System.out.println("Title of the Graph Page is :" + GraphPageTitle);
		Assert.assertEquals(GraphPageTitle, "Graph");
	}
	
	@Test(priority=1,description ="This test case will check the no of topics on Graph page")
	public void noOfTopics() {
		List<WebElement> topics =driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total No of Topics on Graph Page :"+" "+topics.size());
		for(int i = 0; i< topics.size(); i++) {
	        
	         String s = topics.get(i).getText();
	         System.out.println("Topics"+" "+i+ " : " + s);
	      }
		System.out.println("--------------------------------------------------------------------");
	}
	
	@Test(priority = 3)
	public void SelectStackModule() {
		DsAlgo_HomePage home=new DsAlgo_HomePage();
		home.getDropDownBox("Stack");

	}

}
