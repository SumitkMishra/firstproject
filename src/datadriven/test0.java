package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties pdata=new Properties();
		FileInputStream fis=new FileInputStream("./data.properties");
		pdata.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.id("email")).sendKeys(pdata.getProperty("username"));
		 driver.findElement(By.name("password")).sendKeys(pdata.getProperty("password"));
		 Thread.sleep(2000);
		 driver.close();

	}

}
