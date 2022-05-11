package dsalgo.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dsalgo.base.Base;
import com.dsalgo.utils.ExcelUtils;

public class TryEditor extends Base{
	
	static String path="C:\\Users\\hepsi\\eclipse-workspace\\DS_Algo\\src\\test\\java\\excel_resource\\DsAlgo.xlsx";
	
	@FindBy(xpath="//textarea[@autocorrect='off']") WebElement Editor;
	@FindBy(xpath="//button[contains(text(),'Run')]") WebElement RunButton;
	@FindBy(xpath="//pre[contains(@id, 'output')]") WebElement ResultEditor;

	public TryEditor(){
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle() {
		return driver.getTitle();
	}
	
	public void editor(String query) throws IOException {
		
		Editor.sendKeys(query);
		RunButton.click();
		

	}
		
}

