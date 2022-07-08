package website1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class addbooks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path1 = "D:\\selenium\\selenium-java-4.2.2\\chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/itctesting33/Downloads/star%20book%20store/star%20book%20store/addbooks.html");
	driver.findElement(By.id("bookname")).sendKeys("Clean Code");
	driver.findElement(By.id("price")).sendKeys("200");
	Thread.sleep(2000);
driver.findElement(By.id("img")).sendKeys("D:\\libproject\\img");
Thread.sleep(2000);
driver.findElement(By.id("add-btn")).click();
driver.close();

	
	}

}
