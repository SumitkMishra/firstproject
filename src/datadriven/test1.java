package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String url=wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String username=wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		String password=wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.id("email")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		

	}

}
