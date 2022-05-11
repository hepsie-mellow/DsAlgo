package array.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.base.Base;

import dsalgo.pages.TryEditor;

public class ArrayHomePage extends Base{
	
	@FindBy (xpath="//a[contains(text(), 'Arrays in Python')]") WebElement ArrayIn_Link;
	@FindBy (xpath="//a[contains(text(), 'Arrays Using List')]") WebElement ArraysUsing_Link;
	@FindBy (xpath="//a[contains(text(), 'Basic Operations in Lists')]") WebElement BasicOperations_Link;
	@FindBy (xpath="//a[contains(text(), 'Applications of Array')]") WebElement ApplicationsArray_Link;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement TryhereButton;
	
	public ArrayHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//click on Arrays in Python Link
	public void getArrayIn_Link() {
		
		try {
			if (ArrayIn_Link.isEnabled()){
				
				ArrayIn_Link.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	//click on Arrays Using List Link
	public void getArraysUsing_Link() {
		try {
			if (ArraysUsing_Link.isEnabled()){
				
				ArraysUsing_Link.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	//click on Basic Operations in Lists Link
	public void getBasicOperations_Link() {
		try {
			if (BasicOperations_Link.isEnabled()){
				
				BasicOperations_Link.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	//click on Applications of Array Link
	public void getApplicationsArray_Link() {
		try {
			if (ApplicationsArray_Link.isEnabled()){
				
				ApplicationsArray_Link.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
//		return ApplicationsArray_Link;
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
