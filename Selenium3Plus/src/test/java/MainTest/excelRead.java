package MainTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelRead {
	@Test
	public void readexcel()
	{
		String filepath = "C:\\MyData\\TestData\\Loginset.xlsx";
		File file=new File(filepath);
		
		try {
			InputStream is = new FileInputStream(file);
		 	XSSFWorkbook workbook = new XSSFWorkbook(is);
		 	XSSFSheet sheet1=workbook.getSheet("Sheet1");
		 	System.out.println(sheet1.getLastRowNum());
		 	for(int i=1;i<=sheet1.getLastRowNum();i++)
		 	{
		 	System.out.println("Email:"+sheet1.getRow(i).getCell(0).getStringCellValue());
		 	System.out.println("Password:"+sheet1.getRow(i).getCell(1).getStringCellValue());
		 	}

		 	} 
		catch (FileNotFoundException e) {
		 	// TODO Auto-generated catch block
		 	e.printStackTrace();
		 	} 
		catch (IOException e) {
		 	// TODO Auto-generated catch block
		 	e.printStackTrace();
		 }
		
	}
		
}


