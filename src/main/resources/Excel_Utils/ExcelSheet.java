package Excel_Utils;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	public static final String FILE_NAME = "/Users/hepsi/Desktop/DsAlgo.xlsx";
	public static XSSFWorkbook workbook = new XSSFWorkbook();
	
public static void excel() throws IOException {
		
		System.out.println("excel");
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
