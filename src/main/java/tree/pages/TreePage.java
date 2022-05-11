package tree.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.base.Base;

import dsalgo.pages.TryEditor;

public class TreePage extends Base{
	@FindBy (xpath="//a[contains(text(), 'Overview of Trees')]") WebElement OverviewofTrees_Link;
	@FindBy (xpath="//a[contains(text(), 'Terminologies')]") WebElement Terminologies_Link;
	@FindBy (xpath="//a[contains(text(), 'Types of Trees')]") WebElement TypesofTrees_Link;
	@FindBy (xpath="//a[contains(text(), 'Tree Traversals')]") WebElement TreeTraversals_Link;
	@FindBy (xpath="//a[contains(text(), 'Traversals-Illustration')]") WebElement TraversalsIllustration_Link;
	@FindBy (xpath="//a[contains(text(), 'Binary Trees')]") WebElement BinaryTrees_Link;
	@FindBy (xpath="//a[contains(text(), 'Types of Binary Trees')]") WebElement TypesofBinaryTrees_Link;
	@FindBy (xpath="//a[contains(text(), 'Binary Tree Traversals')]") WebElement BinaryTreeTraversals_Link;
	@FindBy (xpath="//a[contains(text(), 'Implementation of Binary Trees')]") WebElement ImplementationofBinaryTrees_Link;
	@FindBy (xpath="//a[contains(text(), 'Applications of Binary trees')]") WebElement ApplicationsofBinarytrees_Link;
	@FindBy (xpath="//a[contains(text(), 'Binary Search Trees')]") WebElement BinarySearchTrees_Link;
	@FindBy (xpath="//a[contains(text(), 'Implementation Of BST')]") WebElement ImplementationOfBST_Link;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement TryhereButton;
	
	public TreePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//click on Overview of Trees Link
		public void OverviewofTrees_Link() {
			
			try {
				if (OverviewofTrees_Link.isEnabled()){
					OverviewofTrees_Link.click();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		//click on Terminologies  Link
		public void Terminologies_Link() {
			
			try {
				if (Terminologies_Link.isEnabled()){
					
					Terminologies_Link.click();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		//click on Types of Trees Link
		public void TypesofTrees_Link() {
			
			try {
				if (TypesofTrees_Link.isEnabled()){
					
					TypesofTrees_Link.click();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		//click on Tree Traversals Link
			public void TreeTraversals_Link() {
				
				try {
					if (TreeTraversals_Link.isEnabled()){
						
						TreeTraversals_Link.click();
					}
				}
				catch(Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
			//click on Traversals-Illustration Link
			public void TraversalsIllustration_Link() {
				
				try {
					if (TraversalsIllustration_Link.isEnabled()){
						TraversalsIllustration_Link.click();
					}
				}
				catch(Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
			//click on Binary Trees Link
			public void BinaryTrees_Link() {
				
				try {
					if (BinaryTrees_Link.isEnabled()){
						
						BinaryTrees_Link.click();
					}
				}
				catch(Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
			//click on Binary Tree Traversals Link
			public void BinaryTreeTraversals_Link() {
				
				try {
					if (BinaryTreeTraversals_Link.isEnabled()){
						
						BinaryTreeTraversals_Link.click();
					}
				}
				catch(Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
			//click on Types of Binary Trees  Link
				public void TypesofBinaryTrees_Link() {
					
					try {
						if (TypesofBinaryTrees_Link.isEnabled()){
							
							TypesofBinaryTrees_Link.click();
						}
					}
					catch(Exception e) {
						
						e.printStackTrace();
					}
					
				}
		
				//click on Implementation of Binary Trees Link
				public void ImplementationofBinaryTrees_Link() {
					
					try {
						if (ImplementationofBinaryTrees_Link.isEnabled()){
							ImplementationofBinaryTrees_Link.click();
						}
					}
					catch(Exception e) {
						
						e.printStackTrace();
					}
					
				}
				
				//click on Applications of Binary trees Link
				public void ApplicationsofBinarytrees_Link() {
					
					try {
						if (ApplicationsofBinarytrees_Link.isEnabled()){
							
							ApplicationsofBinarytrees_Link.click();
						}
					}
					catch(Exception e) {
						
						e.printStackTrace();
					}
					
				}
				
								
				
					
					//click on Binary Search Trees  Link
					public void BinarySearchTrees_Link() {
						
						try {
							if (BinarySearchTrees_Link.isEnabled()){
								
								BinarySearchTrees_Link.click();
							}
						}
						catch(Exception e) {
							
							e.printStackTrace();
						}
						
					}
					
					//click on Implementation Of BST  Link
					public void ImplementationOfBST_Link() {
						
						try {
							if (ImplementationOfBST_Link.isEnabled()){
								
								ImplementationOfBST_Link.click();
							}
						}
						catch(Exception e) {
							
							e.printStackTrace();
						}
						
					}
			
		
		//click on Try here button
		
		public TryEditor tryHere() {
			try {
				if (TryhereButton.isEnabled()){
					
					TryhereButton.click();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			return new TryEditor();
		}


}
