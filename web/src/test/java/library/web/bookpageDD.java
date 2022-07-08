package library.web;
import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class bookpageDD {
	WebDriver driver;
@BeforeMethod
public void befmethod()
{
	 String path1="D:\\new\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path1);
	  driver=new ChromeDriver();
	  driver.get("C:\\Users\\itctesting33\\Downloads\\star book store\\star book store\\books.html");
}
 
 @Test(dataProvider="getData")
 
  public void beforeMethod(String qty) throws InterruptedException {
	  driver.findElement(By.id("a2c")).click();
		driver.findElement(By.id("qty")).clear();
		driver.findElement(By.id("qty")).sendKeys(qty);
		Thread.sleep(2000);
		driver.findElement(By.id("a2c1")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.id("purch")).click();
		Thread.sleep(2000);
		Alert balert=driver.switchTo().alert();
		balert.accept();
  }

 


  @DataProvider
  public String[][] getData() throws Exception {
  File src=new File("C:\\bookpage\\Book6.xlsx");
  FileInputStream fis=new FileInputStream(src);
  XSSFWorkbook wb=new XSSFWorkbook(fis);
  XSSFSheet sheet=wb.getSheet("Sheet1");
  int Rows=sheet.getPhysicalNumberOfRows();
  int cols=sheet.getRow(0).getLastCellNum();

  String[][] data=new String[Rows-1][cols];
  for(int i=0;i<Rows-1;i++)
  {
  for(int j=0;j<cols;j++)
  {
  DataFormatter df=new DataFormatter();
  data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));

  }
  System.out.println();
  }
  wb.close();
  fis.close();
  return data;
  }
  @AfterMethod
  public void afterMethod1() {
  driver.quit();
  }
  }

  
 