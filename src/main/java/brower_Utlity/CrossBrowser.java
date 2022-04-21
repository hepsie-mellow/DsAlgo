package brower_Utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	public static WebDriver driver;
	
	
		
	public static WebDriver startBrowser(String browserName, String url) throws InterruptedException {
		
		if(browserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		
		return driver;
			
			
		
	}

}
