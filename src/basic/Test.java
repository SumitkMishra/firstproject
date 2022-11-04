package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("8962238499");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("timesofindia");
	driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	String d=driver.getTitle();
	System.out.println(d);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	if(d.contains("Online Shopping Site for Mobiles")) {
		System.out.println("Pass:home page is displayed");
	}
	else {
		System.out.println("fail:home page is not display");
	}
		
			
	driver.close();
		

	}

}
