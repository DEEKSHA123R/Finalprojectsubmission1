package website1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class adminpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path1 = "D:\\selenium\\selenium-java-4.2.2\\chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\itctesting33\\Downloads\\star book store\\star book store\\Admin.html");
		driver.findElement(By.id("user")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("admin");
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		Alert adminalert=driver.switchTo().alert();
		adminalert.accept();
		Thread.sleep(2000);
		driver.close();
		
	}

}
