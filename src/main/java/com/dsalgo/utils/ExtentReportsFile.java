package com.dsalgo.utils;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsFile {
	static ExtentReports extent; 
	
	public static ExtentReports extentReport() {
		
	String path ="dsAlgo.html";
	ExtentSparkReporter report = new ExtentSparkReporter(path);
	report.config().setReportName("Ds Algo Automation Results");
	extent= new ExtentReports();
	extent.attachReporter(report);
	extent.setSystemInfo("Tester", "Hepsie De Mellow");
	return extent;
	
	
	}

}
