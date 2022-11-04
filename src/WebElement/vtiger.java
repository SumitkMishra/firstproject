package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
 driver.findElement(By.id("username")).sendKeys("sumit");
 driver.findElement(By.id("password")).sendKeys("123456");
 driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();
 driver.close();
	}

}
