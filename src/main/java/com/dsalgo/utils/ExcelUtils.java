package com.dsalgo.utils;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dsalgo.base.Base;

	public class ExcelUtils extends Base{
		
		public static long PAGELOADWAIT =30;
		public static long IMPLICITWAIT =30;
		public static long EXPLICITWAIT =100;
		public static FileInputStream fi;
		public static FileOutputStream fo;
		public static XSSFWorkbook wb;
		public static XSSFSheet ws;
		public static XSSFRow row;
		public static XSSFCell cell;
		
		public static void webDriver_Click(WebDriver driver, WebElement element, long timeout ) {
			WebElement E1= new WebDriverWait(driver,Duration.ofMinutes(EXPLICITWAIT)).until(ExpectedConditions.elementToBeClickable(element));
					E1.click();
		}
		
		public static void webDriver_Text(WebDriver driver, WebElement element, long timeout, String value ) {
			WebElement E1= new WebDriverWait(driver,Duration.ofMinutes(EXPLICITWAIT)).until(ExpectedConditions.elementToBeClickable(element));
					E1.sendKeys(value);
		}
		
		
		public static int getRowCount(String xlFile, String xlSheet) throws IOException {
			fi = new FileInputStream(xlFile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(xlSheet);
			int rowCount = ws.getLastRowNum();
			wb.close();
			fi.close();
			return rowCount;
		}
		
		
		public static int getCellCount(String xlFile, String xlSheet, int rowNum) throws IOException{
			fi = new FileInputStream(xlFile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(xlSheet);
			row = ws.getRow(rowNum);
			int columnCount = row.getLastCellNum();
			wb.close();
			fi.close();
			return columnCount;
		}
		public static String getCellData(String xlFile, String xlSheet, int rowNum, int columnNum) throws IOException{
			fi = new FileInputStream(xlFile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(xlSheet);
			row = ws.getRow(rowNum);
			cell = row.getCell(columnNum);
			String data;
			try {
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);
			} catch (Exception e) {
				data = "";
			}
			wb.close();
			fi.close();
			return data;
		}
		public static void setCellData(String xlFile, String xlSheet, int rowNum, int columnNum, String data) throws IOException {
			fi = new FileInputStream(xlFile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(xlSheet);
			row = ws.getRow(rowNum);
			cell = row.createCell(columnNum);
			cell.setCellValue(data);
			fo = new FileOutputStream(xlFile);
			wb.write(fo);
			wb.close();
			fo.close();
			fi.close();
		}
	}



