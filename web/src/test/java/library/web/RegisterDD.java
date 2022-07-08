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

public class RegisterDD  {
	WebDriver driver;
  @Test(dataProvider = "getData")
 public void f(String fname,String lname,String email,String pass,String cnfm) throws InterruptedException  {
	  driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.className("toggle-btn2")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("laname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("con")).sendKeys(cnfm);
		driver.findElement(By.id("gender1")).click();
		driver.findElement(By.id("check")).click();
		WebElement selected=driver.findElement(By.id("check"));
		boolean a=selected.isSelected();
		driver.findElement(By.id("res")).click();
  }

  @BeforeMethod
  public void beforeMethod() {
	  String path1="D:\\new\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path1);
	  driver=new ChromeDriver();
	  driver.get("C:\\Users\\itctesting33\\Downloads\\star book store\\star book store\\student.html");
  }


  @DataProvider
  public String[][] getData() throws Exception {
  File src=new File("C:\\reg\\Book4.xlsx");
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

  
 