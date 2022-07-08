package website1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Registerpage {
	WebDriver driver;
  @Test
  public void validRegisterpage() {
	  driver.get("C:\\Users\\itctesting33\\Downloads\\star book store\\star book store\\student.html");
		driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.className("toggle-btn2")).click();
		driver.findElement(By.id("fname")).sendKeys("Deeksha");
		driver.findElement(By.id("laname")).sendKeys("R");
		driver.findElement(By.id("email")).sendKeys("Shettyd963@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shetty123");
		driver.findElement(By.id("con")).sendKeys("Shetty123");
		driver.findElement(By.id("gender1")).click();
		driver.findElement(By.id("check")).click();
		WebElement selected=driver.findElement(By.id("check"));
		boolean a=selected.isSelected();
		driver.findElement(By.id("res")).click();
	  
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
