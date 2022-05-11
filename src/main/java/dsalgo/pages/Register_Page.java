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

public class Register_Page extends Base {
	
//	 public static WebDriver driver;
	 
	 
	
	public Register_Page() {
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//a/button[@class='btn']") public static WebElement getstartbutton;
	@FindBy(xpath="//a[@href='register']")  WebElement registerlinkhome;
	@FindBy(name="username")  WebElement username;
	@FindBy(name="password1")   WebElement password;
	@FindBy(name="password2")  WebElement pwdconfirm;
	@FindBy(xpath="//input[@type='submit']")  WebElement registerButton;
	@FindBy(linkText="Sign in")  WebElement Signinlink;
	@FindBy(xpath="//input[@name='username']")  WebElement signinuname;
	@FindBy(name="password")  WebElement signpassword;
	@FindBy(xpath="//a[contains(text(),'Login')]")  WebElement loginLink;
	@FindBy(linkText="Register!")  WebElement registerlink;
	@FindBy(xpath="//div[@class='alert alert-primary']") public static WebElement pwdAlert;
	
	
	
	
	public DsAlgo_HomePage register(String uname, String pwd) throws FileNotFoundException  {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		pwdconfirm.sendKeys(pwd);
		registerButton.click();
		 
		return new DsAlgo_HomePage();
	}
	
	public LoginPage login() {
		loginLink.click();
		
		return new LoginPage();
		
	}
	
	public String VerifyTitle() {
		return driver.getTitle();
	}
	
	
	
	

}
