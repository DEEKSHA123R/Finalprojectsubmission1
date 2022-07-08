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

public class loginpage {
	WebDriver driver;
	
  @Test
  public void Loginpage() throws InterruptedException {
	  driver.get("C:\\Users\\itctesting33\\Downloads\\star book store\\star book store\\student.html");
		driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.className("login-page"));
		driver.findElement(By.className("toggle-btn1"));
		driver.findElement(By.id("e-mail")).sendKeys("shettyd963@gmail");
		driver.findElement(By.className("check-box")).isSelected();
		driver.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);
	  
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
