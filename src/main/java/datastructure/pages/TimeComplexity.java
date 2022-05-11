package datastructure.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dsalgo.base.Base;

import dsalgo.pages.TryEditor;

public class TimeComplexity extends Base{
	
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement TryhereButton;
	
	
	public TimeComplexity() {
		PageFactory.initElements(driver, this);
	}	
		
	
	public String VerifyTitle() {
		return driver.getTitle();
	}
	
	public TryEditor TryhereButton() {
		
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
