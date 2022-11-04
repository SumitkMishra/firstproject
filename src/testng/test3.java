package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test3 {
	@DataProvider
	public Object getdata() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="123456789";
		obj[0][1]="12358978";
		obj[1][0]="sumit";
		obj[1][1]="preeti";
		obj[2][0]="muna";
		obj[2][1]="mandakini";
		return obj;
	}
	@Test(dataProvider="getdata")
	public void data(String username, String password) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
