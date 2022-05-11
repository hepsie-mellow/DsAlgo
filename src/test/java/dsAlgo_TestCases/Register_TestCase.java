package dsAlgo_TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dsalgo.base.Base;
import com.dsalgo.utils.ExcelUtils;

import dsalgo.pages.DsAlgoStart_Page;
import dsalgo.pages.DsAlgo_HomePage;
import dsalgo.pages.Register_Page;
import io.qameta.allure.Description;

public class Register_TestCase extends Base{
	private static final String FILE_NAME = "C:\\Users\\hepsi\\eclipse-workspace\\DS_Algo\\src\\test\\java\\excel_resource\\register.xlsx";
	Register_Page reg = new Register_Page(); 
	DsAlgo_HomePage home;
	DsAlgoStart_Page start;
	
	public Register_TestCase(){
		super();
	}
	
	
	@DataProvider(name="register")
	public String[][] register() throws IOException {
		
		
		int row =ExcelUtils.getRowCount(FILE_NAME, "Sheet1");
		int col =ExcelUtils.getCellCount(FILE_NAME, "Sheet1", 1);
		String  credentials[][]= new String [row][col];
//		System.out.println(row);
//		System.out.println(col);
		
			
		for(int i=1; i<=row;i++) {
			for(int j=0;j<col;j++) {
				credentials[i-1][j]= ExcelUtils.getCellData(FILE_NAME, "Sheet1", i, j);
//				System.out.println(credentials[i-1][j]);
			}
			
		}
		return credentials;
	}
	@Description("This testcase will open the browser and click on the getstart button")
	@Test(priority=1,description="This testcase will open the browser and click on the getstart button")
	public void startPage() throws InterruptedException {
		
		start = new DsAlgoStart_Page();
//		DsAlgoStart_Page start =PageFactory.initElements(driver, DsAlgoStart_Page.class);
		home=start.startPage();
		home.registerLink();
		
	}
	
	@Test(dataProvider ="register", priority=3, description="This testcase verify the Invalid Usernmae and password")
	public void InvalidRegister(String uname, String pwd) throws FileNotFoundException {
		reg = new Register_Page();
		reg.register(uname, pwd);
		Boolean Alert =reg.pwdAlert.isDisplayed();
		
//		if Alert=="password_mismatch:The two password fields didn’t match." {
			
//		}
		if (Alert==true){
			
			Assert.fail("Invalid Username and password");
		}
		
	}
	
	@Test(priority=2)
	public void VerifyRegisterPageTitle() {
		//Verifying the Register page title
		String RegisterPageTitle = reg.VerifyTitle();
		System.out.println("Title of the Register Page is :" + RegisterPageTitle);
		Assert.assertEquals(RegisterPageTitle, "Registration");
		System.out.println("--------------------------------------------------------------");
	}
	
	@Test(priority=4)
	public void login() {
		reg.login();
		
	}

}
