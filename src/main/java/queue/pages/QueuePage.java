package queue.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.base.Base;

import dsalgo.pages.TryEditor;

public class QueuePage extends Base {

	@FindBy (xpath="//a[contains(text(), 'Implementation of Queue in Python')]") WebElement ImplementationQueue_Link;
	@FindBy (xpath="//a[contains(text(), 'Implementation using collections.deque')]") WebElement Implementation_collection_Link;
	@FindBy (xpath="//a[contains(text(), 'Implementation using array')]") WebElement ImplementArray_Link;
	@FindBy (xpath="//a[contains(text(), 'Queue Operations')]") WebElement QueueOperations_Link;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement TryhereButton;
	
	
	public QueuePage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	//click on Implementation of Queue in Python Link
	public void ImplementationQueue_Link() {
		
		try {
			if (ImplementationQueue_Link.isEnabled()){
				ImplementationQueue_Link.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	//click on Implementation using collections  Link
	public void Implementation_collection_Link() {
		
		try {
			if (Implementation_collection_Link.isEnabled()){
				
				Implementation_collection_Link.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	//click on Implementation using array  Link
	public void ImplementArray_Link() {
		
		try {
			if (ImplementArray_Link.isEnabled()){
				
				ImplementArray_Link.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	//click on Queue Operations  Link
		public void QueueOperations_Link() {
			
			try {
				if (QueueOperations_Link.isEnabled()){
					
					QueueOperations_Link.click();
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
