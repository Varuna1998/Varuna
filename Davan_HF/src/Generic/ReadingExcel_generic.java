package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel_generic 
{
	public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./excel/testdata.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Cell cel = book.getSheet(sheet).getRow(row).getCell(cell);
		String value = cel.toString();//cel.getStringCellValue();
		return value;
	
	}
}
