package dsalgo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.base.Base;

public class DsAlgoStart_Page extends Base {
	
	
	public DsAlgoStart_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a/button[@class='btn']") public static WebElement getstartbutton;
	
	//click on get start button on start page
	public DsAlgo_HomePage startPage() {
		try {
			if (getstartbutton.isEnabled()){
				
				getstartbutton.click();
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
				
		return new DsAlgo_HomePage();
	}

}
