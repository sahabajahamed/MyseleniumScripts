package genericpackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Flib {
	//read excel data

	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{		

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;


	}
	
	//read property data
	public String readPropertyData(String propPath,String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(Key);
		return data;



	}

	//write excel data

	public void writeExcelData(String excelpath,String sheetName,int rowcount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row	row=sheet.getRow(rowcount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);

	}

	//genralize the rowcount ;

	public int rowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}



}
