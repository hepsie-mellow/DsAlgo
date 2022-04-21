package ds_Algo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DsAlgoStart_Page {
	
	
	@FindBy(xpath="//a/button[@class='btn']") public static WebElement getstartbutton;
	
	public  static void homePage() {
		
		getstartbutton.click();
	}

}
