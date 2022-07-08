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

public class addtocartDD {
	WebDriver driver;
  @Test(dataProvider = "getData")
  public void f(String bookname1,String price) throws InterruptedException {
	  driver.findElement(By.id("bookname")).sendKeys(bookname1);
		driver.findElement(By.id("price")).sendKeys(price);
		Thread.sleep(2000);
	driver.findElement(By.id("img")).sendKeys("D:\\libproject\\img");
	Thread.sleep(2000);
	driver.findElement(By.id("add-btn")).click();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	 
		  String path1="D:\\new\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path1);
		  driver=new ChromeDriver();
		  driver.get("file:///C:/Users/itctesting33/Downloads/star%20book%20store/star%20book%20store/addbooks.html");
		  
	  }
  
  


  @DataProvider
  public String[][] getData() throws Exception {
  File src=new File("C:\\addbookdd\\Book5.xlsx");
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
  public void afterMethod() {
  driver.quit();
  }
  }

  
 