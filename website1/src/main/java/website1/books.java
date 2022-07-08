package website1;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class books {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path1 = "D:\\selenium\\selenium-java-4.2.2\\chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\itctesting33\\Downloads\\star book store\\star book store\\books.html");
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
		driver.close();
	}

}
