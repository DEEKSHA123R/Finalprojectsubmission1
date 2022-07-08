package website1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Bookpage {
	WebDriver driver;
  @Test
  public void Bookpage() throws InterruptedException {
	  
		driver.findElement(By.id("a2c")).click();
		driver.findElement(By.id("qty")).clear();
		driver.findElement(By.id("qty")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.id("a2c1")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.id("purch")).click();
		Thread.sleep(2000);
		Alert balert=driver.switchTo().alert();
		balert.accept();
  }
  @BeforeMethod
  public void beforeMethod() {
	  String path1 = "D:\\selenium\\selenium-java-4.2.2\\chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		 driver = new ChromeDriver();
		 driver.get("C:\\Users\\itctesting33\\Downloads\\star book store\\star book store\\books.html");
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
