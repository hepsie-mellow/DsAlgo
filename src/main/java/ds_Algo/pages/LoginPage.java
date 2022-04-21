package ds_Algo.pages;

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

import brower_Utlity.CrossBrowser;

public class LoginPage {
	
	 public static WebDriver driver;
	 
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
	}

		@FindBy(linkText="Sign in") public static WebElement Signinlink;
		@FindBy(xpath="//input[@name='username']") public static WebElement signinuname;
		@FindBy(name="password") public static WebElement signpassword;
		@FindBy(xpath="//input[@value='Login']") public static WebElement loginbutton;
		@FindBy(linkText="Register!") public static WebElement registerlink;
	
	
		
	public static void login() throws IOException {
		System.out.println("driver :"+driver);
		Signinlink.click();
		File FILE_NAME =new File( "/Users/hepsi/Desktop/DsAlgo.xlsx");
		FileInputStream file =new FileInputStream(FILE_NAME);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("DsAlgo");
		String uname=sheet.getRow(1).getCell(0).getStringCellValue();
		String pword=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("username :"+uname);
		System.out.println("password :"+pword);
		signinuname.sendKeys(uname);
		signpassword.sendKeys(pword);
		loginbutton.click();
	}
	

}
