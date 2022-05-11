package dsalgo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.base.Base;

import array.pages.ArrayHomePage;
import datastructure.pages.DataStructurePage;
import graph.pages.GraphPage;
import linked_list.pages.Linked_ListPage;
import queue.pages.QueuePage;
import stack.pages.StackPage;
import tree.pages.TreePage;

public class DsAlgo_HomePage extends Base{
	
		@FindBy(xpath="//a[@href='/register']") WebElement registerlinkhome;
		@FindBy(linkText="Sign in") public static WebElement Signinlink;
		@FindBy (xpath="//a[@href='data-structures-introduction']") WebElement dsGetstartButton;
		@FindBy (xpath="//a[@href='array']") WebElement arrayGetstartButton;
		@FindBy (xpath="//a[@href='linked-list']") WebElement linkListGetstartButton;
		@FindBy (xpath="//a[@href='stack']") WebElement stackGetstartButton;
		@FindBy (xpath="//a[@href='queue']") WebElement queueGetstartButton;
		@FindBy (xpath="//a[@href='tree']") WebElement treeGetstartButton;
		@FindBy (xpath="//a[@href='graph']") WebElement graphGetstartButton;
		@FindBy (xpath="//div[@class=\"nav-item dropdown\"]/a[@href='#']") WebElement dropDownBox;
		@FindBy (xpath="//a[contains(text(),'Arrays')]") WebElement dropDownValue;
		@FindBy (xpath="//a[@href='/logout']") WebElement signOut;
		@FindBy (xpath="//h5[@class='card-title']") WebElement modules;
		
		
	//constructor initializing the driver
	public DsAlgo_HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public Register_Page registerLink() {
		try {
			if (registerlinkhome.isEnabled()){
			registerlinkhome.click();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new Register_Page();
	}
	
	//click on the Data structure module Get Started button
	public DataStructurePage getDsGetstartButton()  {
		try {
			if (dsGetstartButton.isEnabled()){
				
				dsGetstartButton.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return new DataStructurePage();
	}
	
	//click on the Array module Get Started button
	public  ArrayHomePage getArrayGetstartButton() {
		try {
			if (arrayGetstartButton.isEnabled()){
				
				arrayGetstartButton.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return new ArrayHomePage();
	}
	
	//click on the Linked list module Get Started button
	public  Linked_ListPage getLinkListGetstartButton() {
		try {
			if (linkListGetstartButton.isEnabled()){
				
				linkListGetstartButton.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return new Linked_ListPage();
	}
	
	//click on the Stack module Get Started button
	public  StackPage getStackGetstartButton() {
		try {
			if (stackGetstartButton.isEnabled()){
				
				stackGetstartButton.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return new StackPage();
	}
	
	//click on the Queue module Get Started button
	public QueuePage getQueueGetstartButton() {
		try {
			if (queueGetstartButton.isEnabled()){
				
				queueGetstartButton.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return new QueuePage();
	}
	
	//click on the Tree module Get Started button
	public TreePage gettreeGetstartButton() {
		try {
			if (treeGetstartButton.isEnabled()){
				
				treeGetstartButton.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return new TreePage();
	}
	
	//click on the Graph module Get Started button
	public GraphPage getGraphGetstartButton() {
		try {
			if (graphGetstartButton.isEnabled()){
				
				graphGetstartButton.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return new GraphPage();
	}
	
	//choose the modules on drop down box
	public Object getDropDownBox(String value) {
		try {
			if (dropDownBox.isEnabled()){
				
				dropDownBox.click();
			}
						
			WebElement modulename=driver.findElement(By.xpath("//a[contains(text(),'"+value+"')]"));
			if(value=="Arrays") {
				modulename.click();
				return new ArrayHomePage();
				
			}
			if (value=="Linked List") {
				modulename.click();
				return new Linked_ListPage();
			}
			
			if (value=="Queue") {
				modulename.click();
				return new QueuePage();
			}
			if (value=="Tree") {
				modulename.click();
				return new TreePage();
			}
			if (value=="Stack") {
				modulename.click();
				return new StackPage();
			}
			if (value=="Graph") {
				modulename.click();
				return new GraphPage();
			}
	
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return value;
		
		
	}
	public void getSignOut() {
		 signOut.click();
	}
	

	
	
	

}
