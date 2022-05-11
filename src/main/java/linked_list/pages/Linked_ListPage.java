package linked_list.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.base.Base;

import dsalgo.pages.TryEditor;

public class Linked_ListPage extends Base{
	
	
	@FindBy (xpath="//a[contains(text(), 'Introduction')]") WebElement Introduction_Link;
	@FindBy (xpath="//a[contains(text(), 'Creating Linked LIst')]") WebElement CreatingLinkedLIst_Link;
	@FindBy (xpath="//a[contains(text(), 'Types of Linked List')]") WebElement TypesofLinkedList_Link;
	@FindBy (xpath="//a[contains(text(), 'Implement Linked List in Python')]") WebElement ImplementLinkedListPython_Link;
	@FindBy (xpath="//a[contains(text(), 'Traversal')]") WebElement Traversal_Link;
	@FindBy (xpath="//a[contains(text(), 'Insertion')]") WebElement Insertion_Link;
	@FindBy (xpath="//a[contains(text(), 'Deletion')]") WebElement Deletion_Link;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement TryhereButton;
	
	
	public Linked_ListPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//click on Introduction Link
		public void Introduction_Link() {
			
			try {
				if (Introduction_Link.isEnabled()){
					Introduction_Link.click();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		//click on Creating Linked LIst Link
		public void CreatingLinkedLIst_Link() {
			
			try {
				if (CreatingLinkedLIst_Link.isEnabled()){
					
					CreatingLinkedLIst_Link.click();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		//click on Types of Linked List Link
		public void TypesofLinkedList_Link() {
			
			try {
				if (TypesofLinkedList_Link.isEnabled()){
					
					TypesofLinkedList_Link.click();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		//click on Queue Operations  Link
			public void ImplementLinkedListPython_Link() {
				
				try {
					if (ImplementLinkedListPython_Link.isEnabled()){
						
						ImplementLinkedListPython_Link.click();
					}
				}
				catch(Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
			//click on Queue Operations  Link
			public void Traversal_Link() {
				
				try {
					if (Traversal_Link.isEnabled()){
						
						Traversal_Link.click();
					}
				}
				catch(Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
			//click on Queue Operations  Link
			public void Insertion_Link() {
				
				try {
					if (Insertion_Link.isEnabled()){
						
						Insertion_Link.click();
					}
				}
				catch(Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
			//click on Queue Operations  Link
			public void Deletion_Link() {
				
				try {
					if (Deletion_Link.isEnabled()){
						
						Deletion_Link.click();
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
