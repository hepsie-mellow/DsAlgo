package datastructure.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dsalgo.base.Base;
import com.dsalgo.utils.ExcelUtils;

public class DataStructurePage extends Base{
	
	
	@FindBy(xpath="//a[@href='time-complexity']") WebElement TimeComplexLink;
	
	public DataStructurePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle() {
		return driver.getTitle();
	}
	
	public TimeComplexity getTimeComplexLink() throws IOException {
		
		
		TimeComplexLink.click();
				
		return new TimeComplexity();
	}
	

}
