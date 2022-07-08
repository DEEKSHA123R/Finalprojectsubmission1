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
public class aboutus {

	public static void main(String[] args) throws InterruptedException {
	
		String path1 = "D:\\selenium\\selenium-java-4.2.2\\chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/itctesting33/Downloads/star%20book%20store/star%20book%20store/aboutus.html");
		Thread.sleep(2000);
	driver.findElement(By.tagName("a")).click();
Thread.sleep(2000);
driver.close();
	}

}
