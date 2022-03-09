package MainTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utility.driverUtility;

public class readExcelLoginWrite {

	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver = driverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	public String login(String email, String password) {
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.className("login-button")).click();

		String userName = driver.findElement(By.className("account")).getText();
		if (userName.equals(email)) {
			driver.findElement(By.className("ico-logout")).click();
			driver.findElement(By.className("ico-login")).click();
			return "Valid Crdentials";
		} else {
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Password")).clear();
			return "Invalid Credentials";
		}
		
	}

	@Test
	public void readExcel() {
		String filePath = "C:\\MyData\\TestData\\Loginset.xlsx";
		File file = new File(filePath);
		try {
			InputStream is = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(is);
			XSSFSheet sheet1 = workbook.getSheet("Sheet1");
			// System.out.println(sheet1.getLastRowNum());
			for (int i = 1; i <= sheet1.getLastRowNum(); i++) {
				String email = sheet1.getRow(i).getCell(0).getStringCellValue();
				String password = sheet1.getRow(i).getCell(1).getStringCellValue();
				String result = login(email, password);
				sheet1.getRow(i).createCell(2).setCellValue(result);
			}
			OutputStream os = new FileOutputStream(file);
			workbook.write(os);
			workbook.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
