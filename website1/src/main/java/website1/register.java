package website1;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1 = "D:\\selenium\\selenium-java-4.2.2\\chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver = new ChromeDriver();
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

}
