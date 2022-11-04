package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {
	public WebDriver driver;
	@Parameters({"browser name"})
	@Test
public void demo(String browser) {
	if(browser.equals("Chrome")) {
		driver=new ChromeDriver();
	}
	else {
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Reporter.log(driver.getTitle(), true);
	Reporter.log(driver.getCurrentUrl(),true);
}
}
