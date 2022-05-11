package stack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.base.Base;

import dsalgo.pages.TryEditor;

public class StackPage extends Base{
	
	
	@FindBy (xpath="//a[contains(text(), 'Operations in Stack')]") WebElement Operations_Link;
	@FindBy (xpath="//a[contains(text(), 'Implementation')]") WebElement Implementation_Link;
	@FindBy (xpath="//a[contains(text(), 'Applications')]") WebElement Applications_Link;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement TryhereButton;
	
	public StackPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	//click on Operations in Stack Link
			public void Operations_Link() {
				
				try {
					if (Operations_Link.isEnabled()){
						Operations_Link.click();
					}
				}
				catch(Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
			//click on Implementation  Link
			public void Implementation_Link() {
				
				try {
					if (Implementation_Link.isEnabled()){
						
						Implementation_Link.click();
					}
				}
				catch(Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
			//click on Applications  Link
			public void Applications_Link() {
				
				try {
					if (Applications_Link.isEnabled()){
						
						Applications_Link.click();
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
