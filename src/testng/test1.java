package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void main() {
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Reporter.log(driver.getTitle(), true);
		Reporter.log(driver.getCurrentUrl(),true);
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
