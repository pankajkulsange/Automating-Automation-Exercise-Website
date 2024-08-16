package dataDrivenApproch;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReader {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static WebDriver driver;
	static String dataFilePath;
	
	public static void main(String[] args) {
		
		try {
			dataFilePath=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(dataFilePath+File.separator+"Excel"+File.separator+"data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			for (int rowNumber = 1; rowNumber < rowCount; rowNumber++) {
				String username = sheet.getRow(rowNumber).getCell(0).getStringCellValue();
				String password = sheet.getRow(rowNumber).getCell(1).getStringCellValue();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.automationexercise.com/login");
				System.out.println(username +" "+ password);
				driver.findElement(By.xpath("(//input[@type='email' and @name='email'])[1]")).sendKeys(username);
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
				driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
				driver.quit();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}