package website1;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path1 = "D:\\selenium\\selenium-java-4.2.2\\chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\itctesting33\\Downloads\\star book store\\star book store\\student.html");
		driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.className("login-page"));
		driver.findElement(By.className("toggle-btn1"));
		driver.findElement(By.id("e-mail")).sendKeys("shettyd963@gmail");
		driver.findElement(By.className("check-box")).isSelected();
		driver.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);
	}

}
