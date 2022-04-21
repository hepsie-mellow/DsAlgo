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

public class Register_Page {
	
	 public static WebDriver driver;
	 private static final String FILE_NAME = "/Users/hepsi/Desktop/DsAlgo.xlsx";
	 static XSSFWorkbook workbook = new XSSFWorkbook();
	
	public Register_Page(WebDriver driver) {
		this.driver =driver;
	}
	
//	@FindBy(xpath="//a/button[@class='btn']") public static WebElement getstartbutton;
//	@FindBy(linkText="Register") public static WebElement registerlink;
	@FindBy(name="username") public static  WebElement username;
	@FindBy(name="password1") public static WebElement password;
	@FindBy(name="password2") public static WebElement pwdconfirm;
	@FindBy(xpath="//input[@type='submit']") public static WebElement registerButton;
	@FindBy(linkText="Sign in") public static WebElement Signinlink;
	@FindBy(xpath="//input[@name='username']") public static WebElement signinuname;
	@FindBy(name="password") public static WebElement signpassword;
	@FindBy(xpath="//input[@value='Login']") public static WebElement loginbutton;
	@FindBy(linkText="Register!") public static WebElement registerlink;
	
	
	
	
	public static void register() throws FileNotFoundException  {
		
		//String uname, String pwd
		registerlink.click();
		System.out.println("driver :"+driver);
		XSSFSheet sheet = workbook.getSheet("DsAlgo");
		String uname=sheet.getRow(1).getCell(0).getStringCellValue();
		String pword=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("username :"+uname);
		System.out.println("password :"+pword);
		
		username.sendKeys(uname);
		password.sendKeys(pword);
		pwdconfirm.sendKeys(pword);
		registerButton.click();
		
		 
		
	}
	
	public static void excel() throws IOException {
		
		System.out.println("HI");
//		File file = new File("/Users/hepsi/Desktop/testoutput123.xlsx");
//		workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DsAlgo");
		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("Username");
		row.createCell(1).setCellValue("Password");
		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("sdet38");
		row1.createCell(1).setCellValue("pasword@");
		FileOutputStream fo =new FileOutputStream(FILE_NAME);
		workbook.write(fo);
		workbook.close();
	
			
	}
	
	
	
	

}
