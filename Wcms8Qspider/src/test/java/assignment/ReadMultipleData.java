package assignment;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		// READ MULTILE DATA BY USING LOP
		
		for(int i=1; i<10;i++)
		{
			
		

		FileInputStream fis = new FileInputStream("./data/Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		Thread.sleep(3000);
		System.out.println(data);
		 
		}
	}

}
