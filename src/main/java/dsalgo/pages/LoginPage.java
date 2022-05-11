package dsalgo.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.base.Base;
import com.dsalgo.utils.ExcelUtils;

public class LoginPage extends Base{
	
//	 public static WebDriver driver;
	 public static String path="C:\\Users\\hepsi\\eclipse-workspace\\DS_Algo\\src\\test\\java\\excel_resource\\DsAlgo.xlsx";
	 
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

		@FindBy(linkText="Sign in") public static WebElement Signinlink;
		@FindBy(xpath="//input[@name='username']") public static WebElement signinuname;
		@FindBy(name="password") public static WebElement signpassword;
		@FindBy(xpath="//input[@value='Login']") public static WebElement loginbutton;
		@FindBy(linkText="Register!") public static WebElement registerlink;
	
	
	
	
	public DsAlgo_HomePage login(String uname, String pword) throws IOException, InterruptedException {

		signinuname.sendKeys(uname);
		signpassword.sendKeys(pword);
		loginbutton.click();
		
		return new DsAlgo_HomePage();
	}
	
	public String VerifyTitle() {
		return driver.getTitle();
	}
	

}
