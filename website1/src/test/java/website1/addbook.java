package website1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class addbook {
	WebDriver driver;
	
  @Test
  public void validaddbook() throws InterruptedException {
	  driver.get("file:///C:/Users/itctesting33/Downloads/star%20book%20store/star%20book%20store/addbooks.html");
		driver.findElement(By.id("bookname")).sendKeys("Clean Code");
		driver.findElement(By.id("price")).sendKeys("200");
		Thread.sleep(2000);
	driver.findElement(By.id("img")).sendKeys("D:\\libproject\\img");
	Thread.sleep(2000);
	driver.findElement(By.id("add-btn")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  String path1 = "D:\\selenium\\selenium-java-4.2.2\\chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
